import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] factors = new int[number];
        int count = 0;

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                factors[count++] = i;
            }
        }

        System.out.println("Factors:");

        for(int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
