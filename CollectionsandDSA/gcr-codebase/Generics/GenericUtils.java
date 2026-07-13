import java.util.List;

public final class GenericUtils {
    private GenericUtils() {}

    public static <T extends Comparable<? super T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) return null;
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) max = arr[i];
        }
        return max;
    }

    public static void printList(List<?> list) {
        for (Object o : list) System.out.println(o);
    }
}
