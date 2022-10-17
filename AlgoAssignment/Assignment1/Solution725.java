package AlgoAssignment.Assignment1;//solution for 725. Split Linked List in Parts

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

public class Solution725 {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode [] list = new ListNode [k];

        //find length of linked list
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }

        int arr_len = len / k;
        int distribute = len % k;

        ListNode node = head;
        ListNode prev = null;

        int i = 0;

        while(i < k && node != null) {
            list[i] = node;

            for(int j = 0; j < arr_len + (distribute > 0 ? 1 : 0); j++){
                prev = node;
                node = node.next;
            }
            prev.next = null;
            i++;
            distribute--;
        }

        return list;


    }
}
