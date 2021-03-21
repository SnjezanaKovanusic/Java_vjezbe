package nizovi;

import java.util.Arrays;

public class NoviDuplikati {
    public static void main(String[] args) {
                  //[0, 1, 2, 3]
        int[] niz = {5, 6, 5, 8, 5,6,6,3};//4

        int duzina = niz.length;
        for (int i = 0; i < duzina; i++) {
            for (int j = i + 1; j < duzina; j++) {
                //2
                if (niz[i] == niz[j]) {
                    niz[j] = niz[duzina - 1];// [2]=8
                    duzina--;// 3
                    j--; // 1
                }
            }
        }
        int[] niz1 = Arrays.copyOf(niz, duzina);
        System.out.println(Arrays.toString(niz1));
    }
}