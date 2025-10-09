package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian teori: ");
        int teori = input.nextInt();

        System.out.print("Masukkan nilai ujian praktik: ");
        int praktik = input.nextInt();

        boolean lulus = (teori >= 75) || (praktik >= 75);

        System.out.println("Apakah siswa dinyatakan lulus? " + lulus);
    }
}
