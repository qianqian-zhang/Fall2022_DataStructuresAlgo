//solution for 61. Rotate List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode pre = null;

        //find tail node
        int len = 0;
        while(curr != null){
            pre = curr;
            curr = curr.next;
            len++;
        }
        //pre is the tail node and curr = null
        //form a circular list

        curr = head;
        pre.next = curr;

        //determine rotation times
        int rotate = k % len;
        int location = len - rotate;

        //find new head: (len - k)th node from the head
        for(int i = 0; i < location; i++) {
            pre = curr;
            curr = curr.next;
        }

        //curr is the new head node, break pre's connection to curr
        pre.next = null;

        return curr;


    }
}