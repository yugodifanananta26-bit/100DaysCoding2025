package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        int kelipatan = 0;
        System.out.println("Bilangan kelipatan " + M + " dari 1 hingga " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
                kelipatan++;
            }
        }
        System.out.println();
        System.out.println("Jumlah kelipatan " + M + " dari 1 hingga " + N + ": " + kelipatan);
    }
}
