package nizovi;

import java.sql.Array;
import java.util.Arrays;

public class Nizovi_6_26 {
    /**/
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4};
        int[] niz2 = {2, 1, 3, 4};

        if (equils(niz, niz2)) {
            System.out.println("true");

        } else System.out.println("false");

    }

    private static boolean equils(int[] niz, int[] niz2) {
        Arrays.sort(niz);
        Arrays.sort(niz2);
        if (niz.length != niz2.length) {
            return false;
        }
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != niz2[i]) {
                return false;
            }
        }
        return true;
    }
}