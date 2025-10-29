package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas (misalnya 20): ");
        int batas = input.nextInt();
        
        int i = 1;
        while (i <= batas) { 
            System.out.print(i + " ");
            i++;  
        }
        System.out.println("");
    }
}
