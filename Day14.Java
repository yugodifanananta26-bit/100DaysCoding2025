package yugodifan;
public class YugoDifan {
    public static void main(String[] args) {
        // Mengubah String ke tipe data byte
        String a = "100";
        byte angk = Byte.parseByte(a);
        System.out.println("Byte: " + angk);
        // Mengubah String ke tipe data short
        String b = "456";
        short angka = Short.parseShort(b);
        System.out.println("Short: " + angka);
        // Mengubah String ke tipe data int
        String c = "456";
        int angkaa = Integer.parseInt(c);
        System.out.println("Int: " + angkaa);
        // Mengubah String ke tipe data long
        String d = "456";
        long angkaaa = Long.parseLong(d);
        System.out.println("Long: " + angkaaa);
        // Mengubah String ke tipe data float
        String e = "3.14";
        float flo = Float.parseFloat(e);
        System.out.println("Float: " + flo);
        // Mengubah String ke tipe data double
        String f = "2.000";
        double dobel = Double.parseDouble(f);
        System.out.println("Double: " + dobel);
        // Mengubah String ke tipe data boolean
        String benar = "true";
        String salah = "false";
        boolean betul = Boolean.parseBoolean(benar);
        System.out.println("Boolean (true): " + betul);
        boolean tidakBetul = Boolean.parseBoolean(salah);
        System.out.println("Boolean (false): " + tidakBetul);
        /* 
         * Note: 
         * "parse" adalah proses menerjemahkan teks (String) menjadi angka atau tipe data primitif lain.
         * Jika String tidak sesuai format tipe data, akan terjadi error (NumberFormatException).
         */
    }
}
