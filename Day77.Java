package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah string: ");
        String teks = input.nextLine();

        System.out.println("String asli: " + teks);
        System.out.println("substring(0, 5): " + (teks.length() >= 5 ? teks.substring(0, 5) : "String terlalu pendek"));
        System.out.println("replace('a', 'o'): " + teks.replace('a', 'o'));
        System.out.println("trim(): " + teks.trim());

    }
}
