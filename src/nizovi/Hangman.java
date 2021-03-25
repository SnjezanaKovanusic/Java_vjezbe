package nizovi;

import java.util.Arrays;

public class Hangman {
    /*(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as shown in the sample run. Each
letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:*/
    public static void main(String[] args) {
        char rijec[] = izaberiRijec();

        System.out.println(Arrays.toString(rijec));
    }

    private static char[] prikaziZvjezdice(char[] izabranaRijec) {
        Arrays.fill(izabranaRijec, '*');
        return izabranaRijec;
    }

    private static char[] izaberiRijec() {
        String[] rijeci = {"cuko", "pas", "macka", "riba"};
        String izaberi = rijeci[(int) (Math.random() * rijeci.length)];
        char[] izabranaRijec = new char[izaberi.length()];
        for (int i = 0; i < izabranaRijec.length; i++) {
            izabranaRijec[i] = izaberi.charAt(i);
        }
        return prikaziZvjezdice(izabranaRijec);
    }
}

