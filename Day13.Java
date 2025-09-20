package yugodifan;
public class YugoDifan {
    public static void main(String[] args) {
        // 1. Deklarasi & inisialisasi
        char a = '&';
        char b = '$';
        char c = '@';

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // 2. Tukar nilai a dan b (pakai variabel sementara)
        char temp = a; // simpan nilai a
        a = b;         // update a dengan b
        b = temp;      // update b dengan nilai lama a

        // 3. c tetap sama
        System.out.println("\nSesudah ditukar:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
