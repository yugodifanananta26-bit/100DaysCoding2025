package yugodifan;
import java.util.Scanner;
public class YugoDifan {

     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // input nilai
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();
        
        // tampilkan sebelum ditukar
        System.out.println("\nSebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // proses swap pakai variabel sementara
        int temp = a;
        a = b;
        b = temp;
        
        // tampilkan setelah ditukar
        System.out.println("\nSesudah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
