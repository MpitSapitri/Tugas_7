package main;

import models.*;
import services.MarketplaceService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MarketplaceService marketplace = new MarketplaceService();

        Seller seller1 = new Seller("TokoLaptop");
        Seller seller2 = new Seller("BajuMurah");

        Product p1 = new Product("Laptop ASUS", 1000, seller1);
        Product p2 = new Product("Kemeja Batik", 200, seller2);

        marketplace.addProduct(p1);
        marketplace.addProduct(p2);

        System.out.println("=== Produk Tersedia ===");
        for (Product p : marketplace.getAvailableProducts()) {
            System.out.println(p);
        }

        Buyer buyer = new Buyer("Andi");
        List<Product> cart = new ArrayList<>();
        cart.add(p1);
        cart.add(p2);

        System.out.println("\n=== Transaksi ===");
        marketplace.createTransaction(buyer, cart);
    }
}