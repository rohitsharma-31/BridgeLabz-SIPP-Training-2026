public class PrintNumbersNto1 {
    public static void printDescending(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Numbers from " + n + " to 1:");
        printDescending(n);
    }
}
