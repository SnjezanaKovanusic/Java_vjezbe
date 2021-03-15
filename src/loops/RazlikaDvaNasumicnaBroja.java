package loops;

import methode.MyUtil;

public class RazlikaDvaNasumicnaBroja {
    public static void main(String[] args) {
        double prviNasumicniBroj = (int) (Math.random() * 10);

        double drugiNasumicanBroj = (int) (Math.random() * 10);
        double privremena = 0;

        double odgovor = -1;

        if (prviNasumicniBroj < drugiNasumicanBroj) {
            privremena = drugiNasumicanBroj;
            drugiNasumicanBroj = prviNasumicniBroj;
            prviNasumicniBroj = privremena;

        }
        double rezultat = prviNasumicniBroj - drugiNasumicanBroj;
        System.out.println("rezultat" + rezultat);
        System.out.println(prviNasumicniBroj + "prvi");
        System.out.println(drugiNasumicanBroj + "drugi");


        while (odgovor != rezultat) {

            System.out.println("Koliko je " + prviNasumicniBroj + " - " + drugiNasumicanBroj + " ?");
            odgovor = MyUtil.inputInt("");
            if (odgovor == rezultat) {
                System.out.println("Cestitam! ");
            } else {
                System.out.println("Odgovor nije tacan, pokusajte ponovo! ");
            }

        }
    }
}
