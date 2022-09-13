public class practicetree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1 };
        practicetree tree = new practicetree();
        Node root = practicetree(nodes);
        System.out.println(root.data);
    }
}
