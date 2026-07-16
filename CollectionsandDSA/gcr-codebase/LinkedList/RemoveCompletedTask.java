package CollectionsandDSA.gcr_codebase.LinkedList;

public class RemoveCompletedTask {

    static class Node {
        int taskId;
        Node next;

        Node(int taskId) {
            this.taskId = taskId;
        }
    }

    public Node removeTask(Node head, int taskId) {
        if (head == null) {
            return null;
        }
        if (head.taskId == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        return head;
    }
}
