public class Item {
    private String description;
    private int quantity;
    private double price;

    public Item(String description, int quantity, double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Item: " + description + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + getTotalPrice();
    }
}
