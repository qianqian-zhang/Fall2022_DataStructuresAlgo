package Question4;

public class Main {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.head = new Node(2);
        linkList.head.next = new Node(4);
        LinkList.head.next.next = new Node(7);

        LinkList.insert(3);
        Node cur = linkList.head;
        while(cur != null) {
            System.out.print(cur.data);
            cur =cur.next;
        }
    }
}