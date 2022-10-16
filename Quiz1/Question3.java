package Quiz1;

public class Question3 {
    //Binary Tree Level order traversal
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> curLevel = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                Node cur = q.remove();
                curLevel.add(cur.val);

                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            list.add(curLevel);
        }
        return list;
    }
}
