package loops;

import methode.MyUtil;

public class UnosCijelihBrojeva {
    public static void main(String[] args) {
        double suma = 0;
        double brojac = 0;
        System.out.println("Unesite brojeve, nula zatvara program! ");
        while (true) {
            double unosOdKorinsika = MyUtil.inputInt("");

            if (unosOdKorinsika == 0) {
                break;
            }
            suma += unosOdKorinsika;
            brojac++;


        }
        System.out.println("Zbir svih unesenih brojeva je: " + suma +
                " a prosjek unesenih brojeva je: " + (suma / brojac));
    }
}
