package coding100day;
public class Coding100day {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Nilai awal x = " + x);

        // Increment
        System.out.println("Pre-Increment  (++x) = " + (++x)); // langsung naik 1
        System.out.println("Post-Increment (x++) = " + (x++)); // dipakai dulu, baru naik
        System.out.println("Setelah post-increment, x = " + x);

        // Decrement
        System.out.println("Pre-Decrement  (--x) = " + (--x)); // langsung turun 1
        System.out.println("Post-Decrement (x--) = " + (x--)); // dipakai dulu, baru turun
        System.out.println("Setelah post-decrement, x = " + x);
    }
}
