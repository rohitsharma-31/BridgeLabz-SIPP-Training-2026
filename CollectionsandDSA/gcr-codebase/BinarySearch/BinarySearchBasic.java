
public class BinarySearchBasic {
    public static int binarySearch(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;
            if (a[m] < target) l = m + 1; else r = m - 1;
        }
        return -1;
    }

    // Find first occurrence
    public static int firstOccurrence(int[] a, int target) {
        int l = 0, r = a.length - 1, res = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) { res = m; r = m - 1; }
            else if (a[m] < target) l = m + 1; else r = m - 1;
        }
        return res;
    }

    // Find last occurrence
    public static int lastOccurrence(int[] a, int target) {
        int l = 0, r = a.length - 1, res = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) { res = m; l = m + 1; }
            else if (a[m] < target) l = m + 1; else r = m - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(a, 5));
        int[] dup = {1,2,2,2,3};
        System.out.println(firstOccurrence(dup, 2) + "," + lastOccurrence(dup, 2));
    }
}
