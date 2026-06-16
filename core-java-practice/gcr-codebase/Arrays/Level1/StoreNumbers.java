import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0;
        int index = 0;

        while(true) {
            System.out.print("Enter Number: ");
            double value = sc.nextDouble();

            if(value <= 0 || index == 10)
                break;

            numbers[index++] = value;
        }

        for(int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
