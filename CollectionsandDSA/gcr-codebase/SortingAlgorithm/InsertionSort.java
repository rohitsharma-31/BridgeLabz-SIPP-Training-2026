import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }

    public static int insertionSortWithSwaps(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);
        int swaps = 0;
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--; swaps++;
            }
            a[j+1] = key;
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        System.out.println("Before: " + Arrays.toString(arr));
        int[] sorted = insertionSort(arr);
        System.out.println("After: " + Arrays.toString(sorted));
        System.out.println("Swaps (counted as shifts): " + insertionSortWithSwaps(arr));
    }
}
