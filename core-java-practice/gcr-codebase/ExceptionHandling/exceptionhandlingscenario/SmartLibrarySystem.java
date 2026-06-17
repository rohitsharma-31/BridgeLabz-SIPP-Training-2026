public class SmartLibrarySystem {
    private static final String[] books = {"Java", "Python", null, "C++"};

    public static void main(String[] args) {
        getBookLength(1);
        getBookLength(2);
        getBookLength(4);
    }

    public static int getBookLength(int index) {
        try {
            String book = books[index];
            if (book == null) {
                throw new NullPointerException("Book entry is null");
            }
            int length = book.length();
            System.out.println("Book length: " + length);
            return length;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid book index.");
        } catch (NullPointerException e) {
            System.out.println("Book entry is not available.");
        }
        return -1;
    }
}
