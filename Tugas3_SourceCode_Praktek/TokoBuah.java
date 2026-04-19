// NIM: 13020240014
// Nama: Rayhan Firrizqi
// Tanggal: 17 April 2026
// Waktu: 10:30

import java.util.Scanner;
class Buah {

    private String nama;
    private double harga;
    private int stok;

    public Buah(String n, double h, int s) {
        this.nama  = n;
        this.harga = h;
        this.stok  = s;
    }

    public String getInfo() {
        return String.format("%-6s  Rp %,6.0f (stok:%d kg)", nama, harga, stok);
    }

    public double hitungTotal(int qty) {
        return harga * qty;
    }

    public boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty;
            return true;
        }
        return false;
    }
}

public class TokoBuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Buah[] katalog = {
            new Buah("Apel",   15000, 10),
            new Buah("Jeruk",  12000,  8),
            new Buah("Mangga", 20000,  5)
        };

        for (int i = 0; i < katalog.length; i++) {
            System.out.println((i + 1) + ". " + katalog[i].getInfo());
        }

        double total = 0.0;
        int pilih;

        while (true) {
            System.out.print("\nPilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            System.out.print("Jumlah(kg): ");
            int qty = sc.nextInt();

            if (katalog[pilih - 1].tersedia(qty)) {
                double bayar = katalog[pilih - 1].hitungTotal(qty);
                total += bayar;
                System.out.printf("OK +Rp%.0f%n", bayar);
            } else {
                System.out.println("Stok tidak cukup!");
            }
        }

        System.out.printf("Total: Rp%.0f%n", total);
        sc.close();
    }
}