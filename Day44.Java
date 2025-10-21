package coding100day;
import java.util.Scanner;
public class coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();
        
        String predikat;
        if (nilai >= 80 && nilai <= 100) {
            predikat = "A";
        } else if (nilai >= 70 && nilai < 80) {
            predikat = "B";
        } else if (nilai >= 60 && nilai < 70) {
            predikat = "C";
        } else if (nilai >= 50 && nilai < 60) {
            predikat = "D";
        } else if (nilai >= 0 && nilai < 50) {
            predikat = "E";
        } else {
            predikat = "Nilai tidak valid";
        }
        
        System.out.println("Predikat: " + predikat);
    }
}
