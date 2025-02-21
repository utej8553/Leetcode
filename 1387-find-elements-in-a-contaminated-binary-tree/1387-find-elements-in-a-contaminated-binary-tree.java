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
class FindElements {
    List<Integer> set = new ArrayList<>();

    public FindElements(TreeNode root) {
        Func(root, 0);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
    public void Func(TreeNode root, int value){
        if(root==null){
            return;
        } 
        root.val = value;
        set.add(value);
        Func(root.left, 2*value+1);
        Func(root.right, 2*value+2);
        return;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */