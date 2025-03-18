class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode[] temp = new TreeNode[1];
        boolean[] res = new boolean[1];
        Func(root, val, temp, res);
        return res[0] ? temp[0] : null;
    }

    public void Func(TreeNode root, int val, TreeNode[] temp, boolean[] res) {
        if (root == null) {
            return;
        }
        if (root.val == val) {
            temp[0] = root;
            res[0] = true;
            return;
        }
        Func(root.left, val, temp, res);
        Func(root.right, val, temp, res);
    }
}
