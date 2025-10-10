package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah kamu sudah mengerjakan tugas? (true/false): ");
        boolean sudahTugas = input.nextBoolean();

        boolean belumTugas = !sudahTugas;

        System.out.println("Sudah mengerjakan tugas? " + sudahTugas);
        System.out.println("Belum mengerjakan tugas? " + belumTugas);

    }
}
