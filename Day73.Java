package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int angka;
        
        System.out.println("Masukkan angka (negatif untuk berhenti): ");
        
        do {
            angka = input.nextInt();
            if (angka >= 0) {
                total += angka;
            }
        } while (angka >= 0);
        
        System.out.println("Total penjumlahan: " + total);
    }
}
