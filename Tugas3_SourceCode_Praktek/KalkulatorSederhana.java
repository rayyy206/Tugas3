// NIM: 13020240014
// Nama: Rayhan Firrizqi
// Tanggal: 17 April 2026
// Waktu: 09:37

import java.util.Scanner;
class Kalkulator {
    private double angka1;
    private double angka2;
    private char operator;

    public Kalkulator(double a1, double a2, char op) {
        this.angka1 = a1;
        this.angka2 = a2;
        this.operator = op;
    }

    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public double bagi() {
        if (angka2 == 0) {
            System.out.println("Error: pembagian dengan nol!");
            return 0;
        }
        return angka1 / angka2;
    }

    public void tampilHasil() {
        double hasil;

        switch (operator) {
            case '+':
                hasil = tambah();
                break;
            case '-':
                hasil = kurang();
                break;
            case '*':
                hasil = kali();
                break;
            case '/':
                hasil = bagi();
                break;
            default:
                System.out.println("Operator tidak dikenal!");
                return;
        }

        System.out.printf("Hasil: %.2f %c %.2f = %.2f%n", angka1, operator, angka2, hasil);
    }
}

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lagi;

        do {
            System.out.print("Masukkan angka1: ");
            double angka1 = sc.nextDouble();

            System.out.print("Masukkan angka2: ");
            double angka2 = sc.nextDouble();

            System.out.print("Operator (+,-,*,/): ");
            char operator = sc.next().charAt(0);

            Kalkulator k = new Kalkulator(angka1, angka2, operator);

            k.tampilHasil();

            System.out.print("\nHitung lagi? (y/n): ");
            lagi = sc.next().charAt(0);
            System.out.println();

        } while (lagi == 'y');

        System.out.println("Program selesai.");
        sc.close();
    }
}