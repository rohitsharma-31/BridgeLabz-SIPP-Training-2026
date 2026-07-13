public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book: " + title + " by " + author + " | Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "Alice", 499.99);
        book1.displayDetails();
        book2.displayDetails();
    }
}
