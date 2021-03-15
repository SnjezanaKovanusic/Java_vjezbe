package methode;

public class IspisKarakteraSaCasa {

    public static void ispisiKaraktere(char pocetniKarakter, char zavrsniKarakter, int brojPoLiniji) {
        int brojac = 0;
        for (char i = pocetniKarakter; i < zavrsniKarakter; i++) {
            brojac++;
            System.out.print(i + (brojac % brojPoLiniji == 0 ? "\n" : "  "));
/*if (brojac % brojPoLiniji == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + "  ");
            }*/
        }
    }
}
/* char pocetni = 'a';
        char zavrsni = 'z';
        int brojPoLiniji = 3;
        IspisKarakteraSaCasa.ispisiKaraktere(pocetni,zavrsni,brojPoLiniji);
    }*/


