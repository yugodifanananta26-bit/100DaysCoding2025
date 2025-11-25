package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PEMBUATAN AKUN ===");
        System.out.print("Masukkan username: ");
        String usernameAkun = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwordAkun = input.nextLine();
        System.out.println("Akun berhasil dibuat!\n");
        
        String usernameLogin;
        String passwordLogin;
        boolean loginBerhasil = false;
        
        do {
            System.out.println("=== LOGIN ===");
            System.out.print("Masukkan username: ");
            usernameLogin = input.nextLine();
            System.out.print("Masukkan password: ");
            passwordLogin = input.nextLine();
            
            if (usernameLogin.equals(usernameAkun) && passwordLogin.equals(passwordAkun)) {
                loginBerhasil = true;
                System.out.println("Login berhasil! Selamat datang, " + usernameAkun + ".");
            } else {
                System.out.println("Username atau password salah. Coba lagi.\n");
            }
        } while (!loginBerhasil);
    }
}
