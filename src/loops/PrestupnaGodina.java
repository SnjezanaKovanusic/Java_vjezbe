package loops;

import methode.MyUtil;

public class PrestupnaGodina {
    public static void main(String[] args) {
        int unosPočetni = MyUtil.inputInt("Unesite pocetnu godinu: ");
        int unosZavrsnaGodina = MyUtil.inputInt("Unesite krajnju godinu: ");
        for (int year = unosPočetni; year <= unosZavrsnaGodina; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.print(year+" ");
            }

        }

    }
}
