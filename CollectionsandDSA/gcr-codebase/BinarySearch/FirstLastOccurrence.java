import java.util.*;

public class FirstLastOccurrence {
    public static int[] firstAndLast(int[] a, int target) {
        int first = BinarySearchBasic.firstOccurrence(a, target);
        int last = BinarySearchBasic.lastOccurrence(a, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,2,3,4};
        System.out.println(Arrays.toString(firstAndLast(a, 2)));
    }
}
