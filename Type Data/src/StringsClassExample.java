public class StringsClassExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        int lengthStr1 = str1.length();
        System.out.println("Panjang str1: " + lengthStr1);

        char charAtIndex = str1.charAt(0);
        System.out.println("Karakter pada index 0: " + charAtIndex);

        String concatenatedStr = str1.concat(str2);
        System.out.println("Hasil penggabungan: " + concatenatedStr);
        
        boolean isEqual = str1.equals(str2);
        System.out.println("Apakah str1 sama dengan str2? " + isEqual);

        String substringStr = str1.substring(1, 4);
        System.out.println("Potongan str1: " + substringStr);

        int index = str1.indexOf("1");
        System.out.println("Indeks pertama karakter '1' pada str1: " + index);
    }
}
