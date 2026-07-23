package CollectionsandDSA.gcr_codebase.Queue_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {
    private final Deque<Integer> printQueue;

    public PrintQueue() {
        this.printQueue = new ArrayDeque<>();
    }

    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public int printNextJob() {
        return printQueue.removeFirst();
    }

    public int peekNextJob() {
        return printQueue.peekFirst();
    }

    public boolean isEmpty() {
        return printQueue.isEmpty();
    }

    public int size() {
        return printQueue.size();
    }
}