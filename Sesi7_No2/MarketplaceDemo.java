import java.util.ArrayList;
import java.util.ArrayDeque;

public class MarketplaceDemo {
    public static void main(String[] args) {
        // Menggunakan ArrayList untuk menyimpan daftar produk
        ArrayList<String> produkList = new ArrayList<>();
        produkList.add("Laptop");
        produkList.add("Smartphone");
        produkList.add("Headphone");

        System.out.println("Daftar Produk:");
        for (String produk : produkList) {
            System.out.println("- " + produk);
        }

        // Menggunakan ArrayDeque untuk menyimpan antrian transaksi (histori)
        ArrayDeque<String> transaksiQueue = new ArrayDeque<>();
        transaksiQueue.add("Beli Laptop oleh Andi");
        transaksiQueue.add("Beli Smartphone oleh Budi");
        transaksiQueue.add("Beli Headphone oleh Cici");

        System.out.println("\nRiwayat Transaksi:");
        while (!transaksiQueue.isEmpty()) {
            System.out.println(transaksiQueue.poll());
        }
    }
}
