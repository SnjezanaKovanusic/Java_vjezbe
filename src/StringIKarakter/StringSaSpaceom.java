package StringIKarakter;

import java.util.Scanner;

public class StringSaSpaceom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uneste string: ");
        String unos = scanner.next();
        String unosSaSpaceom = unos.replace("", " ");

        System.out.println("String sa spaceom je: "+ unosSaSpaceom);
    }
}
