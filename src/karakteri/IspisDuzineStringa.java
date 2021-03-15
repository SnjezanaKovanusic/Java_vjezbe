package karakteri;

import java.util.Scanner;

public class IspisDuzineStringa {
    public static void main(String[] args) {
        System.out.println("Unesite neki string: ");

        Scanner scanner = new Scanner(System.in);

        String uneseniString = scanner.next();

        System.out.println("Duzina unijetog stringa je: " + uneseniString.length()+
                " a prvi karakter je: " + uneseniString.charAt(0));
    }
}