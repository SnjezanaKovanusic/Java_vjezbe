package methode;

import java.util.Scanner;

public class Ocjena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brojStudenata = 3;
        String ime= " ";
        for (int i = 0; i<brojStudenata; i++) {
            double bodovi = MyUtil.inputDouble("Unesite broj bodova: ");
            System.out.println("Unesite ime studenta: ");
            ime= scanner.next();
            ispisiOcjenu(bodovi);

        }
    }

    public static void ispisiOcjenu(double brojBodova) {
        if (brojBodova > 100) {
            System.out.println("Unos je preko broja bodova! ");
        } else if (brojBodova > 91) {
            System.out.println("Dobili ste 10! ");
        } else if (brojBodova > 81) {
            System.out.println("Dobili ste devet");
        } else if (brojBodova > 71) {
            System.out.println("Dobili ste osam");
        } else if (brojBodova > 61) {
            System.out.println("Dobili ste sedam");
        } else if (brojBodova > 51) {
            System.out.println("Dobili ste pet");
        } else {
            System.out.println("Broj bodova je ispod trazenog broja! ");
        }
    }
}
