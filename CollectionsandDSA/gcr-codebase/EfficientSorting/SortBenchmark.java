import java.util.*;

public class SortBenchmark {
    private static int[] randomArray(int n, int bound) {
        Random r = new Random(42);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = r.nextInt(bound);
        return a;
    }

    private static long timeMerge(int[] a) {
        int[] copy = Arrays.copyOf(a, a.length);
        long s = System.nanoTime();
        MergeSort.mergeSort(copy);
        return System.nanoTime() - s;
    }

    private static long timeQuick(int[] a) {
        int[] copy = Arrays.copyOf(a, a.length);
        long s = System.nanoTime();
        QuickSort3Way.quickSort(copy);
        return System.nanoTime() - s;
    }

    private static long timeCounting(int[] a, int min, int max) {
        int[] copy = Arrays.copyOf(a, a.length);
        long s = System.nanoTime();
        CountingSortGenres.countingSort(copy, min, max);
        return System.nanoTime() - s;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        System.out.println("Benchmark (times in ms):");
        for (int n : sizes) {
            int[] arr = randomArray(n, 1_000_000);
            long tMerge = timeMerge(arr) / 1_000_000;
            long tQuick = timeQuick(arr) / 1_000_000;

            // for counting sort we need bounded values; generate small-range codes 1..20
            int[] genres = randomArray(n, 20);
            for (int i = 0; i < genres.length; i++) genres[i] = (genres[i] % 20) + 1;
            long tCount = timeCounting(genres, 1, 20) / 1_000_000;

            System.out.printf("n=%d  Merge=%dms  Quick3Way=%dms  Counting(1..20)=%dms%n", n, tMerge, tQuick, tCount);
        }
    }
}
