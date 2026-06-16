import java.util.Scanner;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(year + (isLeapYear(year) ? " is a leap year." : " is not a leap year."));
        sc.close();
    }
}
