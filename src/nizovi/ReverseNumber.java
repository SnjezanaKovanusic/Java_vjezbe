package nizovi;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 5};
int [] reveres = reverse(niz);
        System.out.println(Arrays.toString(reveres));

    }

    private static int[] reverse(int[] niz) {
        int[] reverse = new int[niz.length];
        for (int i = 0; i <niz.length; i++) {
           // reverse[(niz.length-i-1)] += niz[i];
            reverse[i] += niz[(niz.length-1-i)];
        }
        return reverse;

    }
}
