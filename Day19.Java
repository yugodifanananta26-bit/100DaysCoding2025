package yugodifan;
import java.util.Scanner;
public class YugoDifan {

     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Input nilai awal sebagai double untuk demonstrasi konversi paksa bertahap
        System.out.print("Masukkan nilai double (misal 123.456): ");
        double nilaiAwal = input.nextDouble();
        
        // Konversi paksa bertahap dari double ke byte
        float nilaiFloat = (float) nilaiAwal;      // double ke float (hilang sedikit presisi)
        long nilaiLong = (long) nilaiFloat;        // float ke long (desimal hilang, jadi 123)
        int nilaiInt = (int) nilaiLong;            // long ke int (potong bit jika besar)
        short nilaiShort = (short) nilaiInt;       // int ke short (potong jika > 32k)
        byte nilaiByte = (byte) nilaiShort;        // short ke byte (potong ke 8-bit)
        
        // Tambahkan contoh overflow: Kalikan dulu untuk lihat efek
        double nilaiOverflowTest = 300.0;
        byte hasilOverflow = (byte) nilaiOverflowTest;  // 300 > 127 → overflow ke -128 + (300-256) = 44? Wait, hitung: 300 mod 256 = 44
        
        // Output dengan penjelasan efek
        System.out.printf("Nilai double: %.3f%n", nilaiAwal);
        System.out.printf("Setelah ke float: %.3f (presisi sedikit hilang)%n", nilaiFloat);
        System.out.printf("Setelah ke long: %d (desimal dibuang)%n", nilaiLong);
        System.out.printf("Setelah ke int: %d%n", nilaiInt);
        System.out.printf("Setelah ke short: %d%n", nilaiShort);
        System.out.printf("Setelah ke byte: %d (rentang terbatas)%n", nilaiByte);
        System.out.printf("Contoh overflow (300 ke byte): %d (seharusnya 300, tapi overflow)%n", hasilOverflow);
        
        input.close();
        
    }
}
