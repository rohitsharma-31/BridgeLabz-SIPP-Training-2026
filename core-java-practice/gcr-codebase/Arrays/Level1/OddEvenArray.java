import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        if(number <= 0) {
            System.out.println("Not a Natural Number");
            sc.close();
            return;
        }

        int[] odd = new int[number];
        int[] even = new int[number];

        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0)
                even[evenIndex++] = i;
            else
                odd[oddIndex++] = i;
        }

        System.out.println("Odd Numbers:");
        for(int i = 0; i < oddIndex; i++)
            System.out.print(odd[i] + " ");

        System.out.println();

        System.out.println("Even Numbers:");
        for(int i = 0; i < evenIndex; i++)
            System.out.print(even[i] + " ");

        sc.close();
    }
}
