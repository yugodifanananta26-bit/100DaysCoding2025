package coding100day;
public class Coding100day {
    public static void main(String[] args) {
        int x = 8;
        int y = 8;
        int z = 12;

        // Membandingkan kesamaan nilai
        System.out.println("x == y : " + (x == y)); // true karena 8 sama dengan 8
        System.out.println("x == z : " + (x == z)); // false karena 8 tidak sama dengan 12

        // Membandingkan ketidaksamaan nilai
        System.out.println("x != y : " + (x != y)); // false karena nilainya sama
        System.out.println("x != z : " + (x != z)); // true karena nilainya berbeda
    }
}
