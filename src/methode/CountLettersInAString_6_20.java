package methode;

public class CountLettersInAString_6_20 {
    public static void main(String[] args) {
        String unosOdKorisnika = "Dobro dosli u ";
        System.out.println("Broj unesenih slova je: " + countLetters(unosOdKorisnika));
    }

    public static int countLetters(String unos) {
        int count = 0;
        for (int i = 0; i < unos.length(); i++) {
            if (Character.isLetter(unos.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
