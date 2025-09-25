package yugodifan;
import java.util.Scanner;
public class YugoDifan {

     public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        // Input nilai awal sebagai byte untuk demonstrasi konversi bertahap
        System.out.print("Masukkan angka kecil (dalam rentang byte, misal 50): ");
        byte nilaiAwal = reader.nextByte();
        
        // Konversi otomatis bertahap
        short nilaiShort = nilaiAwal;  // byte ke short
        int nilaiInt = nilaiShort;     // short ke int
        long nilaiLong = nilaiInt;     // int ke long
        
        // Tambahkan operasi sederhana untuk tunjukkan konversi dalam aritmatika
        float nilaiFloat = (float) (nilaiLong + 0.5f);  // long ke float dengan tambahan desimal
        double nilaiDouble = nilaiFloat * 2.0;          // float ke double dengan perkalian
        
        // Output dengan format yang lebih rapi menggunakan printf
        System.out.printf("Nilai byte  : %d%n", nilaiAwal);
        System.out.printf("Nilai short : %d%n", nilaiShort);
        System.out.printf("Nilai int   : %d%n", nilaiInt);
        System.out.printf("Nilai long  : %d%n", nilaiLong);
        System.out.printf("Nilai float : %.1f%n", nilaiFloat);
        System.out.printf("Nilai double: %.1f%n", nilaiDouble);
        
        reader.close();  // Tutup scanner untuk menghindari resource leak
        
    }
    
}
