package Question2;

import java.util.LinkedList;
import java.util.Queue;

public class BinTree <T> {
    public Node<T> root;

    public BinTree() {

    }

    public void populateParent(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++) {
                Node cur = q.remove();
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
                if(cur.left != null || cur.right != null) {
                    cur.parent = null;
                }
                else cur.parent = q.peek();
            }

        }
    }
}
