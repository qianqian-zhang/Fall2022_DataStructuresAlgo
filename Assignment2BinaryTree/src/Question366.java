package Assignment2BinaryTree.src;

public class Question366 {
    //solution for 366. Find Leaves of Binary Tree
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private int helper(TreeNode node, List<List<Integer>> list) {
        if(node == null) return -1;
        int left = helper(node.left, list);
        int right = helper(node.right, list);
        int level = Math.max(left, right) + 1;

        if(level == list.size()) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);

        node.left = null;
        node.right = null;
        return level;
    }
}
