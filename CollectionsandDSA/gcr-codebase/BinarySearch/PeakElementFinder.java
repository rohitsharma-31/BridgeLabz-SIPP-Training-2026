public class PeakElementFinder {
    public static int findPeak(int[] a) {
        int n = a.length;
        if (n == 0) return -1;
        int l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] > a[m+1]) r = m; else l = m + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {1,3,20,4,1,0};
        int idx = findPeak(a);
        System.out.println("Peak index: " + idx + ", value=" + (idx>=0? a[idx]:"N/A"));
    }
}
