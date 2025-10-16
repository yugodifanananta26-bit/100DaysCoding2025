package coding100day;
import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== MENU WAROENG YUGO =====");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Cemilan");
        System.out.println("4. Selesai");
        System.out.print("Pilih kategori (1-4): ");
        int menuUtama = input.nextInt();

        if (menuUtama == 1) {
            System.out.println("\n-- PILIH MAKANAN --");
            System.out.println("1. Ayam Bakar");
            System.out.println("2. Nasi Goreng Spesial");
            System.out.println("3. Mie Rebus");
            System.out.print("Pilih makanan: ");
            int makanan = input.nextInt();

            if (makanan == 1) {
                System.out.println("Kamu memilih Ayam Bakar. Harga: Rp20.000");
            } else if (makanan == 2) {
                System.out.println("Kamu memilih Nasi Goreng Spesial. Harga: Rp17.000");
            } else if (makanan == 3) {
                System.out.println("Kamu memilih Mie Rebus. Harga: Rp13.000");
            } else {
                System.out.println("Menu makanan tidak tersedia!");
            }
        } 
        else if (menuUtama == 2) {
            System.out.println("\n-- PILIH MINUMAN --");
            System.out.println("1. Es Jeruk");
            System.out.println("2. Kopi Hitam");
            System.out.println("3. Teh Tarik");
            System.out.print("Pilih minuman: ");
            int minuman = input.nextInt();

            if (minuman == 1) {
                System.out.println("Kamu memilih Es Jeruk. Harga: Rp6.000");
            } else if (minuman == 2) {
                System.out.println("Kamu memilih Kopi Hitam. Harga: Rp7.000");
            } else if (minuman == 3) {
                System.out.println("Kamu memilih Teh Tarik. Harga: Rp8.000");
            } else {
                System.out.println("Menu minuman tidak tersedia!");
            }
        } 
        else if (menuUtama == 3) {
            System.out.println("\n-- PILIH CEMILAN --");
            System.out.println("1. Roti Bakar Cokelat");
            System.out.println("2. Pisang Goreng Keju");
            System.out.println("3. Cireng Pedas");
            System.out.print("Pilih cemilan: ");
            int cemilan = input.nextInt();

            if (cemilan == 1) {
                System.out.println("Kamu memilih Roti Bakar Cokelat. Harga: Rp10.000");
            } else if (cemilan == 2) {
                System.out.println("Kamu memilih Pisang Goreng Keju. Harga: Rp12.000");
            } else if (cemilan == 3) {
                System.out.println("Kamu memilih Cireng Pedas. Harga: Rp9.000");
            } else {
                System.out.println("Menu cemilan tidak tersedia!");
            }
        } 
        else if (menuUtama == 4) {
            System.out.println("\nTerima kasih sudah berkunjung ke Waroeng Yugo!");
        } 
        else {
            System.out.println("\nPilihan tidak valid! Silakan coba lagi.");
        }

        System.out.println("\n=== SEMOGA HARI KAMU MENYENANGKAN! ===");
    }
}
