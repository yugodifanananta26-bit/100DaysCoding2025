package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }
        System.out.println("Jumlah angka dari 1 hingga " + N + " adalah: " + jumlah);
    }
}
