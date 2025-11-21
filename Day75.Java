package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah string: ");
        String teks = input.nextLine();
        
        System.out.println("Panjang string: " + teks.length());
        System.out.println("Huruf besar: " + teks.toUpperCase());
        System.out.println("Huruf kecil: " + teks.toLowerCase());
        
    }
}
