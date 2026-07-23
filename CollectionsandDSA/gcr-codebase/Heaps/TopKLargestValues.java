package CollectionsandDSA.gcr_codebase.Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargestValues {
    public List<Integer> topKLargest(int[] transactions, int k) {
        if (transactions == null) {
            throw new IllegalArgumentException("Transactions cannot be null");
        }
        if (k < 0) {
            throw new IllegalArgumentException("k cannot be negative");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int amount : transactions) {
            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (k > 0 && amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        return new ArrayList<>(minHeap);
    }
}