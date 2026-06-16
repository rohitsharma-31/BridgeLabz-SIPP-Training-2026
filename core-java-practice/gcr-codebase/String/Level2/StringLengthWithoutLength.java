import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int manualLength = getLength(text);
        int builtinLength = text.length();

        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtinLength);
        System.out.println("Match: " + (manualLength == builtinLength));
        sc.close();
    }
}
