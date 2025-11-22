package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan string pertama: ");
        String teks1 = input.nextLine();
        
        System.out.print("Masukkan string kedua: ");
        String teks2 = input.nextLine();

        System.out.println("equals() (sama persis): " + teks1.equals(teks2));
        System.out.println("equalsIgnoreCase() (abaikan case): " + teks1.equalsIgnoreCase(teks2));
        System.out.println("contains() (teks1 mengandung teks2): " + teks1.contains(teks2));
        System.out.println("isEmpty() (teks1 kosong): " + teks1.isEmpty());
        System.out.println("isEmpty() (teks2 kosong): " + teks2.isEmpty());

    }
}
