package CollectionsandDSA.gcr_codebase.twopointer_slidingwindow;

public class MaxCpuWindow {

    public int maxSubarrayOfSizeK(int[] cpuLoad, int k) {
        if (cpuLoad == null || k <= 0 || cpuLoad.length < k) {
            return 0;
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpuLoad.length; end++) {
            windowSum += cpuLoad[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start];
                start++;
            }
        }

        return maxSum;
    }
}
