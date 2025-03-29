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
    public int sumOfLeftLeaves(TreeNode root) {
        return Func(root, false);
    }
    public int Func(TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        if (node.left == null && node.right == null)
            return isLeft ? node.val : 0;
        
        return Func(node.left, true) + Func(node.right, false);
    }
}