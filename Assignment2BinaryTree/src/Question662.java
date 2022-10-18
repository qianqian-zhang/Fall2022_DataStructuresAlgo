package Assignment2BinaryTree.src;

public class Question662 {
    //solution for 662. Maximum Width of Binary Tree
    class Node{
        TreeNode node;
        int pos;

        public Node(TreeNode node, int pos) {
            this.node = node;
            this.pos = pos;
        }
    }


    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int ans = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root, 0));

        while(!q.isEmpty()) {
            int size = q.size();
            int diff = 0;

            for(int i = 0; i < size; i++) {
                Node cur = q.remove();
                if(i == 0) diff -= cur.pos;
                if(i == size - 1) diff += cur.pos;

                if(cur.node.left != null) q.add(new Node(cur.node.left, cur.pos * 2));
                if(cur.node.right != null) q.add(new Node(cur.node.right, cur.pos * 2 + 1));
            }
            ans = Math.max(ans, diff + 1);
        }
        return ans;
    }
}
