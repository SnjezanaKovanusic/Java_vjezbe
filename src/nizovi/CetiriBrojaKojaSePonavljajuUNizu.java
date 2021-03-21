package nizovi;

import java.util.Arrays;

public class CetiriBrojaKojaSePonavljajuUNizu {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 3, 3, 3};
        if (isConsencutiveFour(niz)) {
            System.out.println("The list has consencutive four! " + Arrays.toString((niz)));
        } else {
            System.out.println("The list has no consencutive four!");
        }

    }

    private static boolean isConsencutiveFour(int[] niz) {
        int brojac = 0;
        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] == niz[i + 1]) {
                brojac++;
            }
            if (brojac >= 4) {
                return true;

            }
            if (niz[i] != niz[i + 1]) {
                brojac = 1;
            }
        }
        return false;
    }

}

