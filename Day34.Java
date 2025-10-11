package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== LATIHAN: MENGKOMBINASIKAN OPERATOR DASAR ===\n");

        // Input nilai dari pengguna
        System.out.print("Masukkan nilai teori: ");
        double teori = input.nextDouble();

        System.out.print("Masukkan nilai praktik: ");
        double praktik = input.nextDouble();

        System.out.print("Masukkan kehadiran (0 - 100): ");
        double hadir = input.nextDouble();

        // === Operator Aritmatika ===
        double rata = (teori + praktik + hadir) / 3;

        // === Operator Penugasan ===
        // siswa rajin dapat tambahan 1 poin praktik
        praktik += 1; 

        // === Operator Increment ===
        int percobaan = 0;
        percobaan++; 

        // === Operator Perbandingan ===
        boolean teoriCukup = teori >= 70;
        boolean praktikCukup = praktik >= 70;
        boolean hadirCukup = hadir >= 80;

        // === Operator Logika ===
        boolean lulus = teoriCukup && praktikCukup && hadirCukup;

        System.out.println("\n=== HASIL PENILAIAN ===");
        System.out.println("Nilai Teori     : " + teori);
        System.out.println("Nilai Praktik   : " + praktik);
        System.out.println("Kehadiran (%)   : " + hadir);
        System.out.println("Nilai Rata-rata : " + rata);
        System.out.println("Jumlah Percobaan: " + percobaan);
        System.out.println("Status Akhir    : " + (lulus ? "LULUS" : "TIDAK LULUS"));
    }
}
