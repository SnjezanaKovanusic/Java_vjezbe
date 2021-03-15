package StringIKarakter;

import java.util.Scanner;

public class DuzinaStringaIPrviKarakter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rijec: ");
        String unesenaRijec = scanner.next();
        char ch = unesenaRijec.charAt(0);
        System.out.println(unesenaRijec.length());
        System.out.println(ch);
    }
}
