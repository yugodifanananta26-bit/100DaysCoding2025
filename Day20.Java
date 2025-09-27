package yugodifan;
public class YugoDifan {

    public static void main(String[] args) {
        
        // Deklarasi variabel sederhana
        int angka = 250;
        double desimal = 7.89;
        char huruf = 'Z';
        
        // Konversi ke String pakai valueOf
        String strAngka1 = String.valueOf(angka);
        String strDesimal1 = String.valueOf(desimal);
        String strHuruf1 = String.valueOf(huruf);
        
        // Konversi ke String pakai + ""
        String strAngka2 = angka + "";
        String strDesimal2 = desimal + "";
        String strHuruf2 = huruf + "";
        
        // Output hasil
        System.out.println("Hasil konversi int: ");
        System.out.println("- valueOf : " + strAngka1);
        System.out.println("- + \"\"   : " + strAngka2);
        System.out.println();
        
        System.out.println("Hasil konversi double: ");
        System.out.println("- valueOf : " + strDesimal1);
        System.out.println("- + \"\"   : " + strDesimal2);
        System.out.println();
        
        System.out.println("Hasil konversi char: ");
        System.out.println("- valueOf : " + strHuruf1);
        System.out.println("- + \"\"   : " + strHuruf2);
    }
}
