package yugodifan;
import java.util.Scanner;
public class YugoDifan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Operator Aritmatika: Modulus (%)
        System.out.print("Masukkan angka pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int bil2 = input.nextInt();

        // Proses menghitung sisa bagi
        int sisa = bil1 % bil2;

        // Menampilkan hasil
        System.out.println("Hasil dari " + bil1 + " % " + bil2 + " = " + sisa);

    }
}
