package yugodifan;
import java.util.Scanner;
public class YugoDifan {
    public static void main(String[] args) {
        // Meminta user memasukkan data biodata
        try ( // Membuat Scanner untuk input dari keyboard
                Scanner input = new Scanner(System.in)) {
            // Meminta user memasukkan data biodata
            System.out.print("Masukkan nama lengkap: ");
            String nama = input.nextLine();
            System.out.print("Masukkan umur: ");
            int umur = input.nextInt();
            input.nextLine(); // membersihkan newline setelah nextInt()
            System.out.print("Masukkan alamat: ");
            String alamat = input.nextLine();
            System.out.print("Masukkan nomor telepon: ");
            String telepon = input.nextLine();
            // Menampilkan biodata yang sudah dimasukkan
            System.out.println("\n=== Biodata Sederhana ===");
            System.out.println("Nama       : " + nama);
            System.out.println("Umur       : " + umur + " tahun");
            System.out.println("Alamat     : " + alamat);
            System.out.println("No. Telepon: " + telepon);
            // Menutup Scanner
        }
    }
}
