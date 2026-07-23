package CollectionsandDSA.gcr_codebase.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyTriageQueue {
    public static class Patient {
        public final int severity;
        public final String name;

        public Patient(int severity, String name) {
            this.severity = severity;
            this.name = name;
        }
    }

    private final PriorityQueue<Patient> triageQueue;

    public EmergencyTriageQueue() {
        this.triageQueue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> p.severity).reversed());
    }

    public void addPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }

    public Patient peekMostSevere() {
        return triageQueue.peek();
    }
}