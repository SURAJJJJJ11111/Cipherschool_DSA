public class Question32_3 {
     static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    public static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
