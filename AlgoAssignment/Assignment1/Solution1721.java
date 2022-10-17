package AlgoAssignment.Assignment1;//solution for 1721. Swapping Nodes in a Linked List

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution1721 {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode firstNode = head;

        while(k > 1){
            firstNode = firstNode.next;
            k--;
        }

        ListNode secondNode = head;
        ListNode temp = firstNode;

        while(temp.next != null){
            temp = temp.next;
            secondNode = secondNode.next;
        }

        int temp_val = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp_val;

        return head;


    }
}
