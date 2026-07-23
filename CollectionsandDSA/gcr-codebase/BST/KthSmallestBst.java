package CollectionsandDSA.gcr_codebase.BST;

import java.util.ArrayDeque;
import java.util.Deque;

public class KthSmallestBst {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public int kthSmallest(Node root, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be positive");
        }

        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;
            if (count == k) {
                return current.val;
            }
            current = current.right;
        }

        throw new IllegalArgumentException("k out of range");
    }
}