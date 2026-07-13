
public class RotatedArraySearch {
    public static int search(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;
            if (a[l] <= a[m]) { // left sorted
                if (target >= a[l] && target < a[m]) r = m - 1; else l = m + 1;
            } else { // right sorted
                if (target > a[m] && target <= a[r]) l = m + 1; else r = m - 1;
            }
        }
        return -1;
    }

    public static int findMinIndex(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] > a[r]) l = m + 1; else r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        System.out.println("Search 0: " + search(a, 0));
        System.out.println("Min index: " + findMinIndex(a));
    }
}
