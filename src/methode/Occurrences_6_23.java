package methode;

public class Occurrences_6_23 {
    public static void main(String[] args) {
        String input = "Dobro dosli u javu";
        System.out.println("Broj karaktera u stringu trazenih je: " + count(input, 'o'));
    }

    public static int count(String string, char ch) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (ch == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
