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
    public int getMinimumDifference(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Func(root, l, 0);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < l.size(); i++){
            for(int j = 0; j < l.get(i).size(); j++){
                res.add(l.get(i).get(j));
            }
        }
        return min(res);
    }
    public static int min(List<Integer> list) {
        Collections.sort(list);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i - 1));
        }

        return minDiff;
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