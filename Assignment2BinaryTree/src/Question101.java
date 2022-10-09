public class Question101 {
    //solution for 101. Symmetric Tree

    public boolean isSymmetric(TreeNode root) {
        return isSymm(root, root);
    }

    public boolean isSymm(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p != null && q != null) {
            return p.val == q.val && isSymm(p.left, q.right) && isSymm(p.right, q.left);
        }
        return false;
    }
}
