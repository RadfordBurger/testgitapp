package za.ac.cput.domain;

public class Product {
    private String productId;
    private String description;
    private long quantity;

    private double price;

    private Product() {}

    public String getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public long getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
