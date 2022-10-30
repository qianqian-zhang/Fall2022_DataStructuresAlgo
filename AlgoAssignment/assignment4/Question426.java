package AlgoAssignment.assignment4;

public class Question426 {
    //solution for 426. Convert Binary Search Tree to Sorted Doubly Linked List
    Node pre = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        Node dummy = new Node(0, null, null);
        pre = dummy;
        helper(root);

        //dummy.next is the original head, pre is the tail

        dummy.right.left = pre;
        pre.right = dummy.right;

        return dummy.right;
    }

    private void helper(Node node) {
        if (node == null) return;
        //inorder traversal
        helper(node.left);
        //reach leftmost leaf
        pre.right = node;
        node.left = pre;
        pre = node;
        helper(node.right);

    }
}
