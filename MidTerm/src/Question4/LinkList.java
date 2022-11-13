package Question4;

public class LinkList  {

    public static Node head;

    public int length = 0;

    public LinkList() {
        head = null;
    }

    public static void insert(Integer data){
        Node new_node = new Node(data);
        Node current;
        if(head == null || head.data > new_node.data) {
            new_node.next = head;
            head = new_node;
        }

        Node cur = head;

        while(cur.next != null && cur.next.data < new_node.data) {
            cur = cur.next;
        }

        new_node.next = cur.next;
        cur.next = new_node;


        }
    }

