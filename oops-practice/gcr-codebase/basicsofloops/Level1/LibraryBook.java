public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public LibraryBook() {
        this("", "", 0.0, true);
    }

    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public String borrowBook() {
        if (availability) {
            availability = false;
            return "Book borrowed successfully: " + title;
        } else {
            return "Book is currently unavailable: " + title;
        }
    }

    public static void main(String[] args) {
        LibraryBook libraryBook = new LibraryBook("Effective Java", "Joshua Bloch", 850.0, true);
        System.out.println(libraryBook.borrowBook());
        System.out.println(libraryBook.borrowBook());
    }
}
