package models;

public class Product {
    private String name;
    private double price;
    private Seller seller;

    public Product(String name, double price, Seller seller) {
        this.name = name;
        this.price = price;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " (Seller: " + seller.getUsername() + ")";
    }
}