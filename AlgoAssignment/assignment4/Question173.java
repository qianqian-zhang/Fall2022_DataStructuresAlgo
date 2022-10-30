package AlgoAssignment.assignment4;

public class Question173 {
    //173. Binary Search Tree Iterator
    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        helper(root);
    }

    private void helper(TreeNode node) {
        //push all the left nodes to stack
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode top = stack.pop();
        helper(top.right);
        return top.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
