import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== FizzBuzz Using While Loop ===");
        System.out.print("Enter Positive Number: ");
        int number = sc.nextInt();

        int count = 1;
        while (count <= number) {
            if (count % 3 == 0 && count % 5 == 0)
                System.out.println("FizzBuzz");
            else if (count % 3 == 0)
                System.out.println("Fizz");
            else if (count % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(count);

            count++;
        }
        sc.close();
    }
}