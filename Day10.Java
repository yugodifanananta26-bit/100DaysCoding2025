package yugodifan;
public class YugoDifan {
    public static void main(String[] args) {
        // Final variabel yaitu nilainya tidak dapat diubah setelah diinisialisasi
        final int max = 50;
        // Nilai max = 50; tidak dapat diubah.
        System.out.println(max);
        // max = 100; 
        // Baris di atas akan menyebabkan error karena variabel 'max' sudah final dan nilainya tidak bisa diubah.
        // Jadi, jangan coba mengubah nilai variabel final setelah diinisialisasi.
        // Jika ingin nilai lain, buat variabel baru (bukan final)
        int maxBaru = 100;
        System.out.println(maxBaru);
    }
}
