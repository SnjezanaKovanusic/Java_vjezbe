package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class NajmanjiElemntUNizu {
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int unos = scanner.nextInt();
        int[] niz = new int[unos];

        System.out.println("Unesite vrijednost u nizu: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = scanner.nextInt();

        }*/
        int [] niz= {3,2,5,9,1};
        System.out.println("najmanja vrijednost u nizu je na indeksu : " + vrijednostNajmanjaUNizu(niz));


    }

    private static int vrijednostNajmanjaUNizu(int[] niz) {
        int najmanjaVrijednost = niz[0];
        int index = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < najmanjaVrijednost) {
                najmanjaVrijednost = niz[i];
               index=i;
            }
        }
        return index;

    }
}


