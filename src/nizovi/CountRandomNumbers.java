package nizovi;

import java.util.Arrays;

public class CountRandomNumbers {
    public static void main(String[] args) {
/*(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)*/
        int[] niz = new int[10];
        dohvatiNiz(niz);
        for (int i = 0; i < niz.length; i++) {
            System.out.println(i + " se pojavljuje: " + niz[i]);
        }
        int[] dohvacenNIz = niz;
        System.out.println(Arrays.toString(dohvacenNIz));

    }

    private static int[] dohvatiNiz(int[] niz) {
        for (int i = 0; i <= 100; i++) {
            niz[(int) (Math.random() * 10)]++;
        }
        return niz;
    }
}
