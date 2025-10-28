package coding100day;
import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas (misalnya 20): ");
        int batas = input.nextInt();
        
        for (int i = 1; i <= batas; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
