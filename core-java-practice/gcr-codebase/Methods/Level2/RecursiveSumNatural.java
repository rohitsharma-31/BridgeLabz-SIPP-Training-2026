import java.util.Scanner;

public class RecursiveSumNatural {
    public static int recursiveSum(int n) {
        if (n <= 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            int recursiveResult = recursiveSum(n);
            int formulaResult = formulaSum(n);
            System.out.println("Recursive sum: " + recursiveResult);
            System.out.println("Formula sum: " + formulaResult);
            System.out.println("Match: " + (recursiveResult == formulaResult));
        }
        sc.close();
    }
}
