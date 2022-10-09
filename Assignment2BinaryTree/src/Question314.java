public class Question314 {
    //solution for 314. Binary Tree Vertical Order Traversal
    class Node {
        TreeNode root;
        int col;
        public Node(TreeNode root, int col) {
            this.root = root;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        Queue<Node> q = new LinkedList();
        HashMap<Integer, List<Integer>> map = new HashMap();

        if(root == null) return list;

        int maxCol = Integer.MIN_VALUE;
        int minCol = Integer.MAX_VALUE;

        q.offer(new Node(root, 0));

        while(!q.isEmpty()) {
            Node cur = q.poll();
            map.putIfAbsent(cur.col, new ArrayList());
            map.get(cur.col).add(cur.root.val);
            maxCol = Math.max(maxCol, cur.col);
            minCol = Math.min(minCol, cur.col);

            if(cur.root.left != null) {
                q.offer(new Node(cur.root.left, cur.col - 1));
            }

            if(cur.root.right != null) {
                q.offer(new Node(cur.root.right, cur.col + 1));
            }
        }
        for(int i = minCol; i <= maxCol; i++) {
            list.add(map.get(i));
        }
        return list;
    }
}
