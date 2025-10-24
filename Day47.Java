package coding100day;
import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== KALENDER OKTOBER 2025 =====");
        System.out.print("Masukkan tanggal (1-31): ");
        int tanggal = input.nextInt();
        
        System.out.println("=================================");
        String hari;
        switch (tanggal) {
            case 6, 13, 20, 27:
                hari = "Senin";
                break;
            case 7, 14, 21, 28:
                hari = "Selasa";
                break;
            case 1, 8, 15, 22, 29:
                hari = "Rabu";
                break;
            case 2, 9, 16, 23, 30:
                hari = "Kamis";
                break;
            case 3, 10, 17, 24, 31:
                hari = "Jumat";
                break;
            case 4, 11, 18, 25:
                hari = "Sabtu";
                break;
            case 5, 12, 19, 26:
                hari = "Minggu";
                break;
            default:
                hari = "Tanggal tidak valid! Masukkan angka 1-31.";
                break;
        }
        
        if (hari.equals("Tanggal tidak valid! Masukkan angka 1-31.")) {
            System.out.println(hari);
        } else {
            System.out.printf("%s, %d Oktober 2025%n", hari, tanggal);
        } 
    }
}
