package yugodifan;
import java.util.Scanner;
public class YugoDifan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);

        // Tukar nilai tanpa variabel temp, pakai perkalian dan pembagian
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("Sesudah ditukar: a = " + a + ", b = " + b);
    }
}
