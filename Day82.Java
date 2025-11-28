package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i+1) + " : ");
            int angka = input.nextInt();

            if (angka < 0) {
                data[i] = 0;
            } else {
                data[i] = angka;
            }
        }

        System.out.println("\n===== ISI ARRAY =====");

        int total = 0;
        int jumlahNol = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Indeks " + i + " : " + data[i]);
            total += data[i];
            if (data[i] == 0) {
                jumlahNol++;
            }
        }

        double rata = (double) total / n;

        System.out.println("\nTotal nilai array    : " + total);
        System.out.println("Rata-rata nilai      : " + rata);
        System.out.println("Jumlah nilai nol     : " + jumlahNol);
    }
}
