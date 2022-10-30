package AlgoAssignment.assignment4;

public class Question285 {
    //solution for 285. Inorder Successor in BST
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        //find the smallest node whose value is bigger than p
        //traverse from the root, if root < p, traverse to right; if root > p, root is the potential inorder successor, update ans and traverse to left to see if there is a node in the left sub tree that is bigger than p
        TreeNode ans = null;
        while (root != null) {
            if (root.val <= p.val) {
                root = root.right;
            } else {
                //root. val > p.val, root is the potential target root
                ans = root;
                root = root.left;
            }
        }
        return ans;
    }
}
