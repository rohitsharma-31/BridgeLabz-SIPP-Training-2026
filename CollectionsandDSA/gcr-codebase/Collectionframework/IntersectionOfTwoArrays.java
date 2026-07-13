import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        for (int n : nums1) a.add(n);
        HashSet<Integer> res = new HashSet<>();
        for (int n : nums2) if (a.contains(n)) res.add(n);
        int[] out = new int[res.size()];
        int i = 0;
        for (int v : res) out[i++] = v;
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2}))); 
    }
}
package Collectionframework;
import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        for (int n : nums1) a.add(n);
        HashSet<Integer> res = new HashSet<>();
        for (int n : nums2) if (a.contains(n)) res.add(n);
        int[] out = new int[res.size()];
        int i = 0;
        for (int v : res) out[i++] = v;
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2}))); 
    }
}
