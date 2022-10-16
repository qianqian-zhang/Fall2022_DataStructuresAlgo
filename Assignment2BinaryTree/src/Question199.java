public class Question199 {
    public List<Integer> rightSideView(TreeNode root) {
        //solution for 199. Binary Tree Right Side View

        //reverse level order traversal approach
        List<Integer> list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();

        if(root == null) return list;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if(i == 0) list.add(cur.val); 
                //reverse level order traversal
                if(cur.right != null) queue.offer(cur.right);
                if(cur.left != null) queue.offer(cur.left);
            }
        }
        return list;
    }
}
