public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Elemen ke-0: " + numbers[0]);
        System.out.println("Elemen ke-2: " + numbers[2]);

        String[] names = {"Alice", "Bob", "Charlie", "David",};

        System.out.println("Nama pertama: " + names[0]);
        System.out.println("Nama terakhir: " + names[3]);

        System.out.println("Semua elemen array numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Semua elemen array names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
