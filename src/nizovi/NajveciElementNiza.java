package nizovi;

import java.util.Scanner;

public class NajveciElementNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int unos = scanner.nextInt();
        int[] niz = new int[unos];

        System.out.println("Unesite vrijednost u nizu: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = scanner.nextInt();

        }
        int najvecaVrijednost = niz[0];
        int index = 0;
        for (int i = 0; i < niz.length; i++) {
            if (najvecaVrijednost < niz[i]) {
                najvecaVrijednost = niz[i];
                index = i;

            }

        }
        System.out.print(" Najveca vrijdenost elemenata niza je: " + najvecaVrijednost + " na elementu broj " + index);
    }
}
