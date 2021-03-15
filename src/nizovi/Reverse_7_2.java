package nizovi;

import java.util.Scanner;

public class Reverse_7_2 {

    public static void main(String[] args) {


        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverse = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[i] += numbers[i];
            System.out.print( reverse[i]+" ");


        }

    }
}



