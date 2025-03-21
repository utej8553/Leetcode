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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> l = new ArrayList<>();
        Func(root, l, 0, 0);
        return l.contains(targetSum);
    }
    public void Func(TreeNode root, List<Integer> l, int level, int sum){
        if(root==null){
            return;
        }
        sum = sum + root.val;
        if(root.left==null&&root.right==null){
            l.add(sum);
            return;
        }
        Func(root.left, l, level+1, sum);
        Func(root.right, l, level+1, sum);
        return;
    }
}