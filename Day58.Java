package coding100day;

public class Coding100day {
    public static void main(String[] args) {
        int N = 5; 
        
        System.out.println("Angka dari 1 hingga " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 

        System.out.println("Angka dari " + N + " hingga 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
