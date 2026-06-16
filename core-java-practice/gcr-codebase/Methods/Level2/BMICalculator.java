import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weightKg, double heightMeters) {
        return weightKg / (heightMeters * heightMeters);
    }

    public static String getCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal weight";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        if (height <= 0) {
            System.out.println("Height must be greater than 0.");
        } else {
            double bmi = calculateBMI(weight, height);
            System.out.printf("BMI: %.2f\n", bmi);
            System.out.println("Category: " + getCategory(bmi));
        }
        sc.close();
    }
}
