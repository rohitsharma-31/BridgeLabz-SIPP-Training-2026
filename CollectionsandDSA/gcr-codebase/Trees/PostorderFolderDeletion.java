package CollectionsandDSA.gcr_codebase.Trees;

public class PostorderFolderDeletion {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void deleteFolderTree(Node node) {
        if (node == null) {
            return;
        }
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node);
    }

    private void deleteNode(Node node) {
        System.out.println("Deleting node " + node.val);
    }
}