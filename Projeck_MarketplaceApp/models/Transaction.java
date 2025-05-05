package models;

import interfaces.Transactable;
import java.util.List;

public class Transaction implements Transactable {
    private Buyer buyer;
    private List<Product> products;

    public Transaction(Buyer buyer, List<Product> products) {
        this.buyer = buyer;
        this.products = products;
    }

    @Override
    public double getTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String getSummary() {
        StringBuilder sb = new StringBuilder("Buyer: " + buyer.getUsername() + "\nItems:\n");
        for (Product p : products) {
            sb.append("- ").append(p.toString()).append("\n");
        }
        sb.append("Total: $").append(getTotal()).append("\n");
        return sb.toString();
    }
}
