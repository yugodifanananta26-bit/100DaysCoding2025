package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double Total = 0;
        int JumlahAngkaValid = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
       
        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            double angka = input.nextDouble();
            
            if (angka > 0) {
                Total += angka;
                JumlahAngkaValid++;
                if (angka > max) max = angka;
                if (angka < min) min = angka;
            } else if (angka == 0) {
                System.out.println("Angka 0 diabaikan.");
            } else {
                break;
            }
        }
        if (JumlahAngkaValid == 0) {
            System.out.println("Tidak ada data untuk dihitung.");
        } else {
            double rataRata = Total / JumlahAngkaValid;
            System.out.println("===== HASIL =====");
            System.out.println("Total penjumlahan : " + Total);
            System.out.println("Jumlah angka valid: " + JumlahAngkaValid);
            System.out.println("Rata-rata : " + rataRata);
            System.out.println("Angka maksimum : " + max);
            System.out.println("Angka minimum : " + min);
        }
    }
}
