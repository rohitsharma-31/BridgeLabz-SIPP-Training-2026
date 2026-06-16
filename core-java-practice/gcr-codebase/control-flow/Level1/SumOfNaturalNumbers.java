import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 4: Sum of Natural Numbers ===");
        System.out.print("Enter a number: ");
        int naturalNum = sc.nextInt();
        if (naturalNum >= 0) {
            int sum = naturalNum * (naturalNum + 1) / 2;
            System.out.println("The sum of " + naturalNum + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + naturalNum + " is not a natural number");
        }
        sc.close();
    }
}