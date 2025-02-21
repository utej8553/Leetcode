import java.util.*;

class FindElements {
    Set<Integer> set = new HashSet<>();

    public FindElements(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> values = new Stack<>();
        stack.push(root);
        values.push(0);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int value = values.pop();
            set.add(value);

            if (node.right != null) {
                stack.push(node.right);
                values.push(2 * value + 2);
            }
            if (node.left != null) {
                stack.push(node.left);
                values.push(2 * value + 1);
            }
        }
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}
