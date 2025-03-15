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
    public int sumRootToLeaf(TreeNode root) {
        List<String> l = new ArrayList<>();
        Func(root, l, new StringBuilder());
        return sum(l);
    }
    public void Func(TreeNode root, List<String> l, StringBuilder s){
        if(root==null){
            return;
        }
        s.append(root.val);
        if(root.left==null && root.right==null){
            l.add(String.valueOf(s));
        } else {
            Func(root.left, l, s);
            Func(root.right, l, s);
        }
        s.deleteCharAt(s.length() - 1);
    }
     public int sum(List<String> bin) {
        int sum = 0;
        for (String b : bin) {
            sum += Integer.parseInt(b, 2);  
        }
        return sum;
    }
}