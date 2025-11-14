
package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = scanner.nextInt();
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
