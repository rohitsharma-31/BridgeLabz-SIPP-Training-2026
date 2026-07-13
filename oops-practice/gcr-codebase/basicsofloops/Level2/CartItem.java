import java.util.ArrayList;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    private ArrayList<CartItem> cart;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.cart = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    public double displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.price * item.quantity;
        }
        System.out.println("Total cost: " + total);
        return total;
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Cart", 0, 0);
        cart.addItem(new CartItem("Book", 150.0, 2));
        cart.addItem(new CartItem("Pen", 20.0, 3));
        cart.displayTotalCost();
        cart.removeItem("Pen");
        cart.displayTotalCost();
    }
}
