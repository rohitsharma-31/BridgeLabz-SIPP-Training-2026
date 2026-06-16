public class NullPointerDemo {
    public static void generateNPE() {
        String text = null;
        // this will throw NullPointerException
        int len = text.length();
        System.out.println("Length: " + len);
    }

    public static void handleNPE() {
        try {
            String text = null;
            System.out.println("Accessing length in handleNPE...");
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling generateNPE() (will throw):");
        try {
            generateNPE();
        } catch (NullPointerException e) {
            System.out.println("Caught NPE from generateNPE(): " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handleNPE():");
        handleNPE();
    }
}
