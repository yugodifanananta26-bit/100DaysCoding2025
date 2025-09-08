package day02.java;
public class Day02Java {
    public static void main(String[] args) {
        // Judul :Penggunaan println(), print(), dan printf()
        // Deklarasi variabel sesuai data
        String nama = "Yugo Difan Ananta";  //munyimpan nama (String)
        int umur = 17;                      //munyimpan umur (integer)
        double tinggi = 170.0;              //munyimpan tinggi (dooble)
        // Menggunakan println()
        /* println() akan mencetak teks dan otomatis pindah 
           ke baris baru setelahnya.
        */
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        // Menggunakan print()
        /* print() akan mencetak teks tanpa pindah ke baris baru, 
           sehingga output berikutnya akan berada di baris yang sama.
        */
        System.out.print("Nama: " + nama + ", ");
        System.out.print("Umur: " + umur + ", ");
        System.out.print("Tinggi: " + tinggi + " cm\n");
        // Menggunakan printf() dengan format
        /* printf() digunakan untuk mencetak teks dengan format tertentu, 
           misalnya menampilkan angka dengan jumlah desimal tertentu, 
           atau menyisipkan variabel ke dalam string dengan format yang 
           diinginkan.
        */
        System.out.printf("Nama: %s, Umur: %d, Tinggi: %.2f cm\n", nama, umur, tinggi);
    }
    
}
