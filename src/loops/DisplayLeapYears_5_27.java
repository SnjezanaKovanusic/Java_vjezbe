package loops;

public class DisplayLeapYears_5_27 {
    public static void main(String[] args) {
        /*
        Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by exacly one space.
         Also disply the number of leap years in this period.
         ALGORITAM:
         1. napraviti petlju za prikaz perioda od 101 do 2100;
         2. utvrditi da li je godina prestupna;
         3. izracunati broj godina prikazanih od 101 do 2100;

        * */
        int brojacPrestupnihGodina = 0; // brojac za red

        for (int godina = 101; godina <= 2100; godina++) { //ispis godina od 101 do 2100

            if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) { // uslov da li je godina prestupna
                brojacPrestupnihGodina++; //ako jeste povecaj brojac



                System.out.print(godina + (brojacPrestupnihGodina % 10 == 0 ? "\n" : " "));
            }

        }

    }
}
