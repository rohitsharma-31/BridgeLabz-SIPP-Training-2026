import java.util.*;

public class FirstUniqueEvenElement {
    public static Integer firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer, Integer> cnt = new LinkedHashMap<>();
        for (int n : nums) if (n % 2 == 0) cnt.put(n, cnt.getOrDefault(n,0)+1);
        for (Map.Entry<Integer,Integer> e : cnt.entrySet()) if (e.getValue() == 1) return e.getKey();
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueEven(new int[]{1,2,3,2,4,4,6}));
        System.out.println(firstUniqueEven(new int[]{1,3,5}));
    }
}
package Collectionframework;
import java.util.*;

public class FirstUniqueEvenElement {
    public static Integer firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer, Integer> cnt = new LinkedHashMap<>();
        for (int n : nums) if (n % 2 == 0) cnt.put(n, cnt.getOrDefault(n,0)+1);
        for (Map.Entry<Integer,Integer> e : cnt.entrySet()) if (e.getValue() == 1) return e.getKey();
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueEven(new int[]{1,2,3,2,4,4,6}));
        System.out.println(firstUniqueEven(new int[]{1,3,5}));
    }
}
