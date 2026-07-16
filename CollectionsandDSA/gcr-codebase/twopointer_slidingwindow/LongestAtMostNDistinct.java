package CollectionsandDSA.gcr_codebase.twopointer_slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestAtMostNDistinct {

    public int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {
        if (keyIds == null || n < 0) {
            return 0;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < keyIds.length; end++) {
            freq.merge(keyIds[end], 1, Integer::sum);
            while (freq.size() > n) {
                int leftKey = keyIds[start];
                freq.put(leftKey, freq.get(leftKey) - 1);
                if (freq.get(leftKey) == 0) {
                    freq.remove(leftKey);
                }
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
