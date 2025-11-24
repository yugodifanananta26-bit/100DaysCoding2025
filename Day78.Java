package coding100day;
public class Coding100day {
    public static void main(String[] args) {
        String teksUtama = " yugo difan ananta ";
        String teksBanding = "yugo difan ananta";
        System.out.println("=== METHOD DASAR ===");
        System.out.println("Panjang string: " + teksUtama.length());
        System.out.println("Huruf besar: " + teksUtama.toUpperCase());
        System.out.println("Huruf kecil: " + teksUtama.toLowerCase());
        System.out.println("\n=== METHOD PENGECEKAN ===");
        System.out.println("equals() (sama persis): " + teksUtama.equals(teksBanding));
        System.out.println("equalsIgnoreCase() (abaikan case): " + teksUtama.equalsIgnoreCase(teksBanding));
        System.out.println("contains() (utama mengandung banding): " + teksUtama.contains(teksBanding));
        System.out.println("\n=== METHOD MANIPULASI ===");
        System.out.println("isEmpty(): " + teksUtama.isEmpty());
        System.out.println("trim(): '" + teksUtama.trim() + "'");
        System.out.println("replace('a', 'o'): " + teksUtama.replace('a', 'o'));
        System.out.println("substring(0, 5): " + (teksUtama.length() >= 5 ? teksUtama.substring(0, 5) : "String terlalu pendek"));
    }
}
