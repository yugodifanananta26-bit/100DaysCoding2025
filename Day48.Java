package coding100day;
import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.print("Masukkan angka pertama (bilangan bulat): ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operasi = input.next().charAt(0);
        
        System.out.print("Masukkan angka kedua (bilangan bulat): ");
        int angka2 = input.nextInt();
        
        int hasil = 0;
        boolean valid = true;
        
        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2; // Pembagian integer (hasil bulat)
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operasi tidak valid! Gunakan +, -, *, atau /.");
                valid = false;
                break;
        }
        
        if (valid) {
            System.out.printf("Hasil: %d %c %d = %d%n", angka1, operasi, angka2, hasil);
        }
    }
}
