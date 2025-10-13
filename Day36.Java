package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian teori: ");
        int teori = input.nextInt();

        System.out.print("Masukkan nilai ujian praktik: ");
        int praktik = input.nextInt();

        if (teori >= 75) {
            if (praktik >= 75) {
                System.out.println("Selamat! Kamu lulus teori dan praktik.");
            } else {
                System.out.println("Kamu lulus teori, tapi belum lulus praktik.");
            }
        } else {
            if (praktik >= 75) {
                System.out.println("Kamu belum lulus teori, tapi sudah lulus praktik.");
            } else {
                System.out.println("Kamu belum lulus keduanya, terus semangat belajar!");
            }
        }
    }
}
