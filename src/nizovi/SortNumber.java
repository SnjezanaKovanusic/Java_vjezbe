package nizovi;

import java.util.Arrays;
import java.util.Collections;

public class SortNumber {
    /*(Revise selection sort) In Section 7.11, you used selection sort to sort an array.
The selection-sort method repeatedly finds the smallest number in the current
array and swaps it with the first. Rewrite this program by finding the largest number and swapping it with the last. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers.*/
    public static void main(String[] args) {
        int[] niz = {5, 2, 3, 4, 1};
        int[] sortirani = sort(niz);
        System.out.println(Arrays.toString(sortirani));
    }

    private static int[] sort(int[] niz) {
        Arrays.sort(niz);
        int[] reverse = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            // reverse[(niz.length-i-1)] += niz[i];
            reverse[i] += niz[(niz.length - 1 - i)];
        }


        return reverse;
    }

    private static int[] sortOdNajmanjeg(int[] niz) {
        Arrays.sort(niz);


        return niz;
    }
}
