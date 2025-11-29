package coding100day;
public class Coding100day {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Array: [10, 20, 30, 40, 50]");
        System.out.println("Total penjumlahan: " + total);
    }
}
