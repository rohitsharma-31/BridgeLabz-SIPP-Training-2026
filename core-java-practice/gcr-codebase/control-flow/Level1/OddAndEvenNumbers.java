import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 16: Odd and Even Numbers ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " is Even");
                } else {
                    System.out.println(j + " is Odd");
                }
            }
        }
        sc.close();
    }
}