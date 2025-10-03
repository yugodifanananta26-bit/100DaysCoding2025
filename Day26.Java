package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Operator Penugasan (+, -, *, /, %) 
        
        int angka ;
        
        System.out.println("Selamat Datang Di Operator Penugasan:");
        System.out.println("\nmenambahkan(+=):");
        System.out.print("angka        = ");
        angka = input.nextInt();
        System.out.print("tambah angka = ");
        angka += input.nextInt();
        System.out.println("hasil (+=)   = " + angka);
        
        System.out.println("\nmengurangkan(-=):");
        System.out.print("kurang angka = ");
        angka -= input.nextInt();
        System.out.println("hasil (-=)   = " + angka);
        
        System.out.println("\nmengalikan(*=):");
        System.out.print("kali angka = ");
        angka *= input.nextInt();
        System.out.println("hasil (*=) = " + angka);
        
        System.out.println("\nmembagi(/=):");
        System.out.print("bagi angka   = ");
        angka /= input.nextInt();
        System.out.println("hasil (/=)   = " + angka);
        
        System.out.println("\nmembagi sisa(%=):");
        System.out.print("bagi sisa angka = ");
        angka %= input.nextInt();
        System.out.println("hasil (%=)      = " + angka);

           
    }
    
}
