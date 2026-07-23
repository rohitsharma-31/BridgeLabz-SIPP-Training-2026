package CollectionsandDSA.gcr_codebase.Queue_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxThroughputWindow(int[] readings, int k) {
        if (readings == null) {
            throw new IllegalArgumentException("Readings cannot be null");
        }
        if (k <= 0 || k > readings.length) {
            throw new IllegalArgumentException("Window size must be between 1 and readings length");
        }

        int n = readings.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && readings[deque.peekLast()] <= readings[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = readings[deque.peekFirst()];
            }
        }

        return result;
    }
}