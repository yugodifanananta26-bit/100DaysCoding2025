package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran array: ");
        int ukuran = input.nextInt();
        
        int[] array = new int[ukuran];

        System.out.println("Masukkan " + ukuran + " elemen array:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("\nSemua elemen array:");
        for (int i = 0; i < ukuran; i++) {
            System.out.println("Indeks " + i + ": " + array[i]);
        }
    }
}
