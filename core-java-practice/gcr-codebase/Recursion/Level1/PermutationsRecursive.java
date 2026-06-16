import java.util.ArrayList;
import java.util.List;

public class PermutationsRecursive {
    public static List<String> permutations(String s) {
        List<String> result = new ArrayList<>();
        permute(s.toCharArray(), 0, result);
        return result;
    }

    private static void permute(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1, result);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of " + input + ":");
        System.out.println(permutations(input));
    }
}
