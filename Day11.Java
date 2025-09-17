package yugodifan;
import java.util.Scanner; // Import Scanner untuk input
public class YugoDifan {
    public static void main(String[] args) {
        // Menggunakan try-with-resources agar Scanner otomatis ditutup setelah selesai
        try (Scanner input = new Scanner(System.in)) {
            // Meminta user memasukkan angka (integer)
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();
            // Membersihkan karakter newline yang tersisa setelah nextInt()
            input.nextLine();
            // Meminta user memasukkan nama (String)
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            // Menampilkan hasil input yang sudah dimasukkan user
            System.out.println("Angka yang dimasukkan: " + angka);
            System.out.println("Nama yang dimasukkan: " + nama);
        } // Scanner otomatis ditutup di sini
    }
}
