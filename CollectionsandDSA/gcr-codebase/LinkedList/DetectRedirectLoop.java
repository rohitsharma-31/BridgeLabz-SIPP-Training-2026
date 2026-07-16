package CollectionsandDSA.gcr_codebase.LinkedList;

public class DetectRedirectLoop {

    static class Node {
        String url;
        Node next;

        Node(String url) {
            this.url = url;
        }
    }

    public boolean hasRedirectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
