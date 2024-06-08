public class CharacterClassExample {
    public static void main(String[] args){
        char ch = 'A' ;

        if (Character.isLetter(ch)) {
            System.out.println(ch + " adalah huruf.");
        } else {
            System.out.println(ch + " bukan huruf.");
        }

        if (Character.isDigit(ch)) {
            System.out.println(ch + " adalah digit angka.");
        } else {
            System.out.println(ch + " bukan digit angka.");
        }

        if (Character.isWhitespace(ch)) {
            System.out.println(ch + " adalah spasi atau karakter whitespace.");
        } else {
            System.out.println(ch + " bukan spasi atau karakter whitespace.");
        }

        char lowercaseCh = Character.toLowerCase(ch);
        System.out.println("Huruf " + ch + " diubah menjadi " + lowercaseCh);

        String chString = Character.toString(ch);
        System.out.println("Karakter " + ch + " dalam bentuk String: " + chString);

    }
}
