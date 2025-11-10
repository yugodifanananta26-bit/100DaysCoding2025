package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M (basis): ");
        int M = input.nextInt();

        System.out.print("Masukkan nilai N (eksponen): ");
        int N = input.nextInt();
        
        int hasil = 1;
        System.out.print("Proses pangkat: ");
        for (int i = 1; i <= N; i++) {
            hasil *= M;
            System.out.print(M);
            if (i < N) {
                System.out.print(" x ");
            } else {
                System.out.print(" = " + hasil);
            }
        }
        System.out.println();
        System.out.println(M + " pangkat " + N + " adalah: " + hasil);
    }
}
