package loops;

public class BrojSuglasnikaISamoglasnika_5_49 {
    /*
    * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
Write a program that prompts the user to enter a string and displays the number
of vowels and consonants in the string*/
    public static void main(String[] args) {
        String unesenaRijec = "Danas nam je divan dan!";
        int brojacSuglasnika = 0;
        int brojacSamoglasnika = 0;


        for (int i = 0; i < unesenaRijec.length(); i++) {
            if (Character.isLetter(unesenaRijec.charAt(i))) {
                if (Character.toLowerCase(unesenaRijec.charAt(i)) == 'a' ||
                   (Character.toLowerCase(unesenaRijec.charAt(i)) == 'e' ||
                   (Character.toLowerCase(unesenaRijec.charAt(i)) == 'i' ||
                   (Character.toLowerCase(unesenaRijec.charAt(i)) == 'a' ||
                    (Character.toLowerCase(unesenaRijec.charAt(i)) == 'o')))))
                {
                    brojacSamoglasnika++;
                }
                else{
                    brojacSuglasnika++;
                }
            }
        }
        System.out.println(brojacSamoglasnika);
        System.out.println(brojacSuglasnika);
    }

}
