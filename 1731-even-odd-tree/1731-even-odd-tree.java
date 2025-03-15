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
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Func(root, l, 0);
        for (int i = 0; i < l.size(); i++) {
            if (!valid(l.get(i), i)) {
                return false;
            }
        }
        return true;
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
    public boolean valid(List<Integer> l, int level){
        for (int i = 0; i < l.size(); i++) {
            int val = l.get(i);

            if (level % 2 == 0) {
                if (val % 2 == 0 || (i > 0 && val <= l.get(i - 1))) return false;
            } else {
                if (val % 2 == 1 || (i > 0 && val >= l.get(i - 1))) return false;
            }
        }
        return true;
    }
}