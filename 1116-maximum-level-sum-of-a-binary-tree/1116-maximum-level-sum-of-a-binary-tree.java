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
    public int maxLevelSum(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Func(root, l, 0);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < l.size(); i++){
            int sum = 0;
            for(int j = 0;j < l.get(i).size(); j++){
                sum = sum + l.get(i).get(j);
            }
            res.add(sum);
        }
        int maxIndex = 0;
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i) > res.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex+1;
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