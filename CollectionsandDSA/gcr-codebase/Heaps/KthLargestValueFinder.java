package CollectionsandDSA.gcr_codebase.Heaps;

import java.util.PriorityQueue;

public class KthLargestValueFinder {
    public int findKthLargest(int[] scores, int k) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores cannot be null or empty");
        }
        if (k <= 0 || k > scores.length) {
            throw new IllegalArgumentException("k must be between 1 and the number of scores");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int score : scores) {
            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        return minHeap.peek();
    }
}