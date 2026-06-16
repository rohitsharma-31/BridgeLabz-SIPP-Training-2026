import java.util.Scanner;

public class CountdownWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 8: Countdown While Loop ===");
        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launch!");
        sc.close();
    }
}