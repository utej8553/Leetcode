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
    int index = 0;
    int n = 0;
    public TreeNode recoverFromPreorder(String s) {
        n = s.length();
        return Func(0, s);
    }
    public TreeNode Func(int dept, String s){
        if(index >= n){
            return null;
        }
        int count = 0;
        int tempidx = index;
        while(tempidx < n &&!Character.isDigit(s.charAt(tempidx))){
            count++;
            tempidx++;
        }
        if(count!=dept){
            return null;
        }
        index = tempidx;
        int val = 0;
        while(index < n && Character.isDigit(s.charAt(index))){
            val = val*10 + (s.charAt(index)-'0');
            index++;
        }
        TreeNode node = new TreeNode(val);
        node.left = Func(dept+1, s);
        node.right = Func(dept+1, s);
        return node;
    }
}