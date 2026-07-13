import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    private static void sort(int[] a, int[] aux, int l, int r) {
        if (l >= r) return;
        int m = l + (r - l) / 2;
        sort(a, aux, l, m);
        sort(a, aux, m + 1, r);
        merge(a, aux, l, m, r);
    }

    // Merge step runs in linear time O(n) for the merged segment
    private static void merge(int[] a, int[] aux, int l, int m, int r) {
        int i = l, j = m + 1, k = l;
        while (i <= m && j <= r) {
            if (a[i] <= a[j]) aux[k++] = a[i++];
            else aux[k++] = a[j++];
        }
        while (i <= m) aux[k++] = a[i++];
        while (j <= r) aux[k++] = a[j++];
        for (k = l; k <= r; k++) a[k] = aux[k];
    }

    public static void main(String[] args) {
        int[] salaries = {45000, 32000, 78000, 55000, 40000, 60000};
        System.out.println("Salaries before: " + Arrays.toString(salaries));
        mergeSort(salaries);
        System.out.println("Salaries after:  " + Arrays.toString(salaries));

        int[] orders = {850, 420, 1200, 650, 300};
        System.out.println("Orders before: " + Arrays.toString(orders));
        mergeSort(orders);
        System.out.println("Orders after:  " + Arrays.toString(orders));

        int[] ids = {105, 101, 108, 102, 104};
        System.out.println("IDs before: " + Arrays.toString(ids));
        mergeSort(ids);
        System.out.println("IDs after:  " + Arrays.toString(ids));
    }
}
