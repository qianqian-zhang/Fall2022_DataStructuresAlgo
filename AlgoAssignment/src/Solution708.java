//solution for 708. Insert into a Sorted Circular Linked List

/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

public class Solution708 {
    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);

        if(head == null){
            node.next = node;
            return node;
        }

        Node cur = head;
        while(cur. next != head){
            int cur_v = cur.val;
            int next_v = cur.next.val;
            if(cur_v <= insertVal && insertVal <= next_v){
                break;
            }else if(cur_v > next_v){
                if(cur_v <= insertVal || next_v >= insertVal){
                    break;
                }
            }
            cur = cur.next;
        }

        Node temp = cur.next;
        cur.next = node;
        node.next = temp;
        return head;
    }
}
