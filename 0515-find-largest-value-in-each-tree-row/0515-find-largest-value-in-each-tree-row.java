/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Func(root, l, 0);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < l.size(); i++){
            int max = Collections.max(l.get(i));
            res.add(max);
        }
        return res;
    }
    public void Func(TreeNode root, List<List<Integer>> l, int level){
        if(root==null){
            return;
        }
        if (level >= l.size()) {
            l.add(new ArrayList<>());
        }
        l.get(level).add(root.val);
        Func(root.left, l, level+1);
        Func(root.right, l, level+1);
        return;
    }
}