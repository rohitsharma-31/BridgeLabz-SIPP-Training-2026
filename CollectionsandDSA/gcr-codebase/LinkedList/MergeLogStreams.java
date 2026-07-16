package CollectionsandDSA.gcr_codebase.LinkedList;

public class MergeLogStreams {

    static class Node {
        long timestamp;
        String message;
        Node next;

        Node(long timestamp, String message) {
            this.timestamp = timestamp;
            this.message = message;
        }
    }

    public Node mergeLogStreams(Node a, Node b) {
        Node dummy = new Node(0, "");
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.timestamp <= b.timestamp) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;
        return dummy.next;
    }
}
