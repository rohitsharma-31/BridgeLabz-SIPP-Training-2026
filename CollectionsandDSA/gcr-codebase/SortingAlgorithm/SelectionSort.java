import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) if (a[j] < a[minIdx]) minIdx = j;
            int tmp = a[i]; a[i] = a[minIdx]; a[minIdx] = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] scores = {64, 25, 12, 22, 11};
        System.out.println("Before: " + Arrays.toString(scores));
        System.out.println("After: " + Arrays.toString(selectionSort(scores)));
    }
}
