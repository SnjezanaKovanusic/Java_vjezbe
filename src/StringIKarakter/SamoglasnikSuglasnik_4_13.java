package StringIKarakter;

import java.util.Locale;

public class SamoglasnikSuglasnik_4_13 {
    /*(Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant*/
    public static void main(String[] args) {
        String unesenoSlovo = "o";
        char promjenjenaVrijednost = unesenoSlovo.toLowerCase(Locale.ROOT).charAt(0);

        if (promjenjenaVrijednost == 'o' || promjenjenaVrijednost == 'e' || promjenjenaVrijednost
                == 'i' || promjenjenaVrijednost == 'u' || promjenjenaVrijednost == 'a') {
            System.out.println(promjenjenaVrijednost + " je samoglasnik");
        } else if (!Character.isLetter(promjenjenaVrijednost)) {
            System.out.println("Nepostojeci unos! ");
        } else {
            System.out.println("Suglasnik: " + promjenjenaVrijednost);

        }

    }
}




