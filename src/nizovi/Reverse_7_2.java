package nizovi;

import MyUtil.PomocnaKlasa;

import java.util.Scanner;

public class Reverse_7_2 {

    public static void main(String[] args) {


        int[] numbers = {9, 1, 2, 33, 4, 5, 6, 7, 8, 9};
        int[] reverse = new int[numbers.length];
        int otpoozadi = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            reverse[otpoozadi] = numbers[i];
            otpoozadi--;
        }
        System.out.println("reverse.toString() = " + reverse.toString());
        ispisiNiz(reverse);


    }

    private static void ispisiNiz(int[] reverse) {
        for (int n : reverse) {
            System.out.print(" " + n);
        }
    }
}



