class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Question32_2 {
    static int height(Node root) {
        if (root == null)
            return -1;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        return Math.max(lHeight, rHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        System.out.println(height(root));
    }
}
