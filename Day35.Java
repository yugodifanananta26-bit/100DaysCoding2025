package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Selamat! Kamu lulus ujian.");
        }
    }
}
