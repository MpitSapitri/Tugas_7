package services;

import models .*;
import java.util.ArrayList;
import java.util.List;

public class MarketplaceService {
    private List<Product> productList = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getAvailableProducts() {
        return productList;
    }

    public void createTransaction(Buyer buyer, List<Product> products) {
        Transaction transaction = new Transaction(buyer, products);
        transactions.add(transaction);
        System.out.println("Transaction Completed!");
        System.out.println(transaction.getSummary());
    }
}
