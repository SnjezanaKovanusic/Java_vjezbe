package nizovi;

import java.util.Arrays;

public class BrojacPonavljanjaBrojaUNizu {
    /*(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:*/
    public static void main(String[] args) {
        int[] niz = new int[100];

        ispisiBrojacPonavljanja(niz);


    }

    private static int[] brojacPonavljanja(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            int randomBroj = (int) (Math.random() * 100);
            niz[randomBroj] = niz[randomBroj] + 1;
        }
        return niz;
    }

    private static void ispisiBrojacPonavljanja(int[] niz) {
        brojacPonavljanja(niz);
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 0) {
                System.out.println((i + 1) + " se pojavljuje " + niz[i] + (niz[i] > 1 ? " puta." : " put."));
            }
        }
    }
}
