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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> s = new ArrayList<>();
        return Func(root, s, k);
    }
    public boolean Func(TreeNode root, List<Integer> s, int k){
        if(root==null){
            return false;
        } if(s.contains(k-root.val)){
            return true;
        }
        s.add(root.val);
        return Func(root.left,s,k)||Func(root.right,s,k);
    }
}