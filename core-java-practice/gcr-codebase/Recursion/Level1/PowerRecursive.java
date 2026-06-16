public class PowerRecursive {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = 8;
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}
