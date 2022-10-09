public class Question103 {
    //solution for 103. Binary Tree Zigzag Level Order Traversal
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;
        TreeNode cur = root;
        queue.offer(cur);
        boolean flag = false;

        while(!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> sublist = new LinkedList<>();
            for(int i = 0; i < size; i++) {
                cur = queue.poll();

                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);

                if(flag) {
                    sublist.addFirst(cur.val);
                }else{
                    sublist.addLast(cur.val);
                }
            }
            flag = !flag;
            result.add(sublist);
        }
        return result;
    }
}
