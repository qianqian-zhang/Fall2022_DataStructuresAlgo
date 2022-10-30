package AlgoAssignment.assignment4;

public class Question99 {
    //solution for 99. Recover Binary Search Tree
    TreeNode first = null;
    TreeNode second = null;
    TreeNode pre = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        //swap the two wrongly placed nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (pre != null && root.val < pre.val) {
            if (first == null) {
                //first time, pre should be the wrong node
                first = pre;
            }
            //second time, root should be the wrong node
            second = root;
        }
        pre = root;

        inorder(root.right);
    }
}
