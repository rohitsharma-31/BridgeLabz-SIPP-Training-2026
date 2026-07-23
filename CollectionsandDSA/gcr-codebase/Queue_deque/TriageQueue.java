package CollectionsandDSA.gcr_codebase.Queue_deque;

import java.util.PriorityQueue;

public class TriageQueue {
    public static class Patient {
        private final int priority;
        private final String name;

        public Patient(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }

        public int getPriority() {
            return priority;
        }

        public String getName() {
            return name;
        }
    }

    private final PriorityQueue<Patient> triageQueue;

    public TriageQueue() {
        this.triageQueue = new PriorityQueue<>((a, b) -> Integer.compare(a.priority, b.priority));
    }

    public void admitPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient callNextPatient() {
        return triageQueue.poll();
    }

    public Patient peekNextPatient() {
        return triageQueue.peek();
    }

    public boolean isEmpty() {
        return triageQueue.isEmpty();
    }

    public int size() {
        return triageQueue.size();
    }
}