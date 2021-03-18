package nizovi;

import java.util.Arrays;

public class MergeTwoSortedListed {
    /*(Merge two sorted lists) Write the following method that merges two sorted lists
 into a new sorted list.
 public static int[] merge(int[] list1, int[] list2)
 Programming Exercises 283284 Chapter 7 Single-Dimensional Arrays
 Implement the method in a way that takes at most list1.length + list2.
 length comparisons. Write a test program that prompts the user to enter two
 sorted lists and displays the merged list. Here is a sample run. Note that the first
 number in the input indicates the number of the elements in the list. This number
 is not part of the list.*/
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5};
        int[] niz2 = {5, 6, 7, 8, 9, 25};
        System.out.println(Arrays.toString(spoji(niz, niz2)));
    }

    private static int[] spoji(int[] niz, int[] niz2) {
        int[] nizSpojeni = new int[niz.length + niz2.length];
        //  for (int i = 0; i < 4; i++) {
        //    nizSpojeni[i]+=niz[i];
        //  nizSpojeni[i+niz.length]+=niz2[i];

        //  }
        //System.out.println(Arrays.toString(nizSpojeni));
        for (int i = 0; i < niz.length; i++) {
            nizSpojeni[i] += niz[i];
        }
        for (int i = 0; i < niz2.length; i++) {
            nizSpojeni[i + niz.length] += niz2[i];
        }
        Arrays.sort(nizSpojeni);
        return nizSpojeni;
    }


}
