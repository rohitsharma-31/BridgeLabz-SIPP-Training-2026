import java.util.Arrays;

public class QuickSort3Way {
    public static void quickSort(int[] a) {
        if (a == null || a.length < 2) return;
        quickSort(a, 0, a.length - 1);
    }

    // 3-way partition (Dutch National Flag) using pivot at lo
    private static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int lt = lo, i = lo + 1, gt = hi;
        int pivot = a[lo];
        while (i <= gt) {
            if (a[i] < pivot) swap(a, lt++, i++);
            else if (a[i] > pivot) swap(a, i, gt--);
            else i++;
        }
        quickSort(a, lo, lt - 1);
        quickSort(a, gt + 1, hi);
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }

    public static void main(String[] args) {
        int[] prices = {4500, 2200, 3800, 1800, 5200};
        System.out.println("Prices before: " + Arrays.toString(prices));
        quickSort(prices);
        System.out.println("Prices after:  " + Arrays.toString(prices));

        int[] sample = {64, 25, 12, 22, 11};
        System.out.println("Sample before: " + Arrays.toString(sample));
        quickSort(sample);
        System.out.println("Sample after:  " + Arrays.toString(sample));
    }
}
