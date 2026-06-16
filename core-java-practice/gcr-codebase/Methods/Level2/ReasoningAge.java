import java.util.Scanner;

public class ReasoningAge {
    public static String getAgeReasoning(int age) {
        if (age < 0) return "Invalid age.";
        if (age <= 12) return "Child";
        if (age <= 19) return "Teenager";
        if (age <= 59) return "Adult";
        return "Senior";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println(getAgeReasoning(age));
        sc.close();
    }
}
