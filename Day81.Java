package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println("Array: [10, 20, 30, 40, 50]");
        System.out.print("Masukkan indeks (0-4): ");
        int indeks = input.nextInt();
        
        if (indeks >= 0 && indeks < array.length) {
            System.out.println("Elemen pada indeks " + indeks + ": " + array[indeks]);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
