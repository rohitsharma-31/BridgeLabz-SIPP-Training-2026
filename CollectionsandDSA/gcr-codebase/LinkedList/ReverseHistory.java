package CollectionsandDSA.gcr_codebase.LinkedList;

public class ReverseHistory {

    static class Node {
        int pageId;
        Node next;

        Node(int pageId) {
            this.pageId = pageId;
        }
    }

    public Node reverseHistory(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
