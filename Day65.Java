package coding100day;
import java.util.Scanner;
public class koding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (Faktorial): ");
        int N = input.nextInt();
        
        int hasil = 1;
        System.out.print("Proses pangkat: ");
        for (int i = 1; i <= N; i++) {
            hasil = hasil*i;
            System.out.print(N);
            if (i < N) {
                System.out.print(" x ");
            } else {
                System.out.print(" = " + hasil);
            }
        }
        System.out.println();
        System.out.println("Faktorial dari " + N + " adalah: " + hasil);
    }
}
