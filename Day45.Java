package coding100day;
import java.util.Scanner;
public class coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();
        
        String predikat;
        
        switch (nilai / 10) {
            case 10: 
            case 9:  
                predikat = "A";
                break;
            case 8:  
                predikat = "A";
                break;
            case 7:  
                predikat = "B";
                break;
            case 6:  
                predikat = "C";
                break;
            case 5:  
                predikat = "D";
                break;
            case 4:  
            case 3:  
            case 2:  
            case 1:  
            case 0:  
                predikat = "E";
                break;
            default: 
                predikat = "Nilai tidak valid";
                break;
        }
        
        System.out.println("Predikat: " + predikat);
        
    }
}
