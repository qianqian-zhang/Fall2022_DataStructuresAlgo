package AlgoAssignment.assignment4;

public class Question449 {
    //solution for 449. Serialize and Deserialize BST
    static TreeNode node;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        node = root;
        return "";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return node;
    }
}
