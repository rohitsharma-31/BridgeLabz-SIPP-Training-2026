import java.util.*;

public class BubbleSortWithStats {
    public static class Result {
        public int[] sorted;
        public int swaps;
        public boolean alreadySorted;
        public Result(int[] sorted, int swaps, boolean alreadySorted) { this.sorted = sorted; this.swaps = swaps; this.alreadySorted = alreadySorted; }
    }

    public static Result bubbleSortWithStats(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        boolean alreadySorted = true;
        int[] a = Arrays.copyOf(arr, n);
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j]; a[j] = a[j+1]; a[j+1] = t; swapped = true; swaps++;
                }
            }
            if (i == 0 && !swapped) alreadySorted = true;
            if (!swapped) break;
            alreadySorted = false;
        }
        return new Result(a, swaps, alreadySorted);
    }

    public static List<int[]> tracePasses(int[] arr) {
        int n = arr.length;
        int[] a = Arrays.copyOf(arr, n);
        List<int[]> passes = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j+1]) { int t = a[j]; a[j]=a[j+1]; a[j+1]=t; swapped = true; }
            }
            passes.add(Arrays.copyOf(a, n));
            if (!swapped) break;
        }
        return passes;
    }

    public static void main(String[] args) {
        // 50 athletes example: generate 50 random scores 0-100
        Random r = new Random(1);
        int[] scores = r.ints(50, 0, 101).toArray();
        Result res = bubbleSortWithStats(scores);
        System.out.println("Bubble swaps: " + res.swaps + ", alreadySorted: " + res.alreadySorted);

        // top-3 medalists (highest scores)
        int[] top = Arrays.copyOf(res.sorted, res.sorted.length);
        Arrays.sort(top); // ascending
        int len = top.length;
        System.out.println("Top-3 medalists: ");
        for (int i = 0; i < Math.min(3, len); i++) System.out.println(top[len-1-i]);

        // trace passes for [64,25,12,22,11]
        int[] sample = {64,25,12,22,11};
        List<int[]> passes = tracePasses(sample);
        System.out.println("Trace passes for [64,25,12,22,11]:");
        for (int i = 0; i < passes.size(); i++) System.out.println("Pass " + (i+1) + ": " + Arrays.toString(passes.get(i)));
    }
}
