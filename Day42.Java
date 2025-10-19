package coding100day;
import java.util.Scanner;
public class coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG GAJI BERSIH ===");

        System.out.print("Masukkan Gaji Pokok : ");
        double gajiPokok = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Status Pernikahan (Menikah/Belum): ");
        String status = input.nextLine();

        double tunjangan;
        double pajak;
        double bpjs;
        double gajiKotor;
        double gajiBersih;

        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.1;
        } else if (status.equalsIgnoreCase("Belum")) {
            tunjangan = gajiPokok * 0.02;
        } else {
            tunjangan = 0;
            System.out.println("Status tidak dikenali, tunjangan = 0");
        }
        System.out.println("Tunjangan : " + tunjangan);

        gajiKotor = gajiPokok + tunjangan;
        System.out.println("Gaji Kotor : " + gajiKotor);

        if (gajiKotor > 8000000) {
            pajak = gajiKotor * 0.12;
        } else if (gajiKotor >= 5000000) {
            pajak = gajiKotor * 0.08;
        } else {
            pajak = gajiKotor * 0.05;
        }
        System.out.println("Pajak : " + pajak);
        
        bpjs = gajiPokok * 0.03;
        System.out.println("BPJS : " + bpjs);

        gajiBersih = gajiKotor - pajak - bpjs;
        System.out.println("Gaji Bersih : " + gajiBersih);

        System.out.println("===================================");
        
    }
}
