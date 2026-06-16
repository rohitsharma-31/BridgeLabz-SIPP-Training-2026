import java.util.Scanner;

public class ReverseString {
    public static String reverse(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Reversed string: " + reverse(input));
        sc.close();
    }
}
