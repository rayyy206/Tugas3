// NIM: 13020240014
// Nama: Rayhan Firrizqi
// Tanggal: 17 April 2026
// Waktu: 10:46

import java.util.Scanner;

class KonversiWaktu {
    private long totalDetik;
    private long detikSekarang;
    private long totalMenit;
    private long menitSekarang;
    private long totalJam;
    private long jamSekarang;

    public KonversiWaktu(long td) {
        this.totalDetik = td;
        konversi();
    }

    public void konversi() {
        detikSekarang  = totalDetik % 60;       
        totalMenit     = totalDetik / 60;        
        menitSekarang  = totalMenit % 60;        
        totalJam       = totalMenit / 60;        
        jamSekarang    = totalJam   % 24;        
    }

    public long hitungDetikSekarang()  { return detikSekarang; }
    public long hitungTotalMenit()     { return totalMenit; }
    public long hitungMenitSekarang()  { return menitSekarang; }
    public long hitungTotalJam()       { return totalJam; }
    public long hitungJamSekarang()    { return jamSekarang; }

    public void tampilkanWaktu() {
        System.out.println("Total detik: " + totalDetik);
        System.out.println("================");
        System.out.printf("Waktu: %02d:%02d:%02d%n", jamSekarang, menitSekarang, detikSekarang);
        System.out.println("================");
        System.out.println();
        System.out.println("Total Detik   : " + totalDetik);
        System.out.println("detikSaat ini : " + detikSekarang);
        System.out.println("menitSaat ini : " + menitSekarang);
        System.out.println("jamSaat ini   : " + jamSekarang);
    }
}

public class KonversiWaktuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long totalDetik = sc.nextLong();

        KonversiWaktu kw = new KonversiWaktu(totalDetik);
        kw.tampilkanWaktu();

        System.out.println();
        System.out.println("--- Contoh lain ---");

        long[] contoh = {3661, 86400};
        String[] keterangan = {"", " (tepat 1 hari)"};

        for (int i = 0; i < contoh.length; i++) {
            KonversiWaktu c = new KonversiWaktu(contoh[i]);
            System.out.println("Input : " + contoh[i]);
            System.out.printf("Output: %02d:%02d:%02d%s%n",
                c.hitungJamSekarang(),
                c.hitungMenitSekarang(),
                c.hitungDetikSekarang(),
                keterangan[i]);
            System.out.println();
        }

        sc.close();
    }
}