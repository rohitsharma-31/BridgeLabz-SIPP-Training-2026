import java.util.Scanner;

public class CountdownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 9: Countdown For Loop ===");
        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
        sc.close();
    }
}