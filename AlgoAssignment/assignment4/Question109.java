package AlgoAssignment.assignment4;

public class Question109 {
    //solution for 109. Convert Sorted List to Binary Search Tree
    public TreeNode sortedListToBST(ListNode head) {
        //find middle node, divide linked list in half, head of second half is the root, root.left = head of first half, root.right = mid.next

        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        //find middle node, cut the linkedlist in half
        ListNode slow = head, fast = head, pre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow is the middle node, pre is the tail of first half
        pre.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;

    }
}
