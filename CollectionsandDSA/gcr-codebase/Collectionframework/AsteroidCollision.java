import java.util.*;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a < 0 && !stack.isEmpty() && stack.peekLast() > 0) {
                int top = stack.peekLast();
                if (top + a == 0) { stack.removeLast(); alive = false; break; }
                else if (top + a > 0) { alive = false; break; }
                else { stack.removeLast(); }
            }
            if (alive) stack.addLast(a);
        }
        int[] res = new int[stack.size()];
        int i = 0;
        for (int v : stack) res[i++] = v;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5,10,-5}))); // [5,10]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8,-8}))); // []
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10,2,-5}))); // [10]
    }
}
package Collectionframework;
import java.util.*;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a < 0 && !stack.isEmpty() && stack.peekLast() > 0) {
                int top = stack.peekLast();
                if (top + a == 0) { stack.removeLast(); alive = false; break; }
                else if (top + a > 0) { alive = false; break; }
                else { stack.removeLast(); }
            }
            if (alive) stack.addLast(a);
        }
        int[] res = new int[stack.size()];
        int i = 0;
        for (int v : stack) res[i++] = v;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5,10,-5}))); // [5,10]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8,-8}))); // []
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10,2,-5}))); // [10]
    }
}
