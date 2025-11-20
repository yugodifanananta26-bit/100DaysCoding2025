package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("=== MENU MAKANAN KHAS INDONESIA ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Rendang");
            System.out.println("3. Sate Ayam");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            
            if (pilihan == 1) {
                System.out.println("Nasi Goreng: Nasi yang digoreng dengan bumbu rempah, telur, ayam, dan sayuran. Hidangan populer dari Jakarta.");
            } else if (pilihan == 2) {
                System.out.println("Rendang: Daging sapi yang dimasak lama dengan santan dan rempah, berasal dari Sumatera Barat. Rasanya gurih dan pedas.");
            } else if (pilihan == 3) {
                System.out.println("Sate Ayam: Tusuk ayam yang dibakar, disajikan dengan bumbu kacang. Hidangan favorit di seluruh Indonesia.");
            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
            
            System.out.println();
            
        } while (pilihan != 4);
    }
}
