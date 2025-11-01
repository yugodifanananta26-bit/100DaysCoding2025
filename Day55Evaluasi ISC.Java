package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka batas (misalnya 10): ");
        int batas = input.nextInt();
        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 0) {
                continue;
            }
            
            System.out.println("Angka ganjil: " + i);
        }
    }
}
