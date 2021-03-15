package methode;

import java.util.Locale;
import java.util.concurrent.Callable;

public class PhoneKeypads_6_21 {
    public static void main(String[] args) {
        String input = "1800flowers";

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                System.out.print(getNumber(Character.toUpperCase(input.charAt(i))));
            } else {
                System.out.print(input.charAt(i));
            }
        }

    }

    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'W')
            return 9;
        else if (uppercaseLetter >= 'T')
            return 8;
        else if (uppercaseLetter >= 'P')
            return 7;
        else if (uppercaseLetter >= 'M')
            return 6;
        else if (uppercaseLetter >= 'J')
            return 5;
        else if (uppercaseLetter >= 'G')
            return 4;
        else if (uppercaseLetter >= 'D')
            return 3;
        else
            return 2;
    }
}
