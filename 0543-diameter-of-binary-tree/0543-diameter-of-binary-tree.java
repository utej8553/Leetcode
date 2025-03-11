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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        Func(root, res);
        return res[0];
    }
    public int Func(TreeNode root, int[] max){
        if(root==null){
            return 0;
        }
        int left = Func(root.left, max);
        int right = Func(root.right, max);
        max[0] = Math.max(max[0], left+right);
        return (1+Math.max(left, right));
    }
}