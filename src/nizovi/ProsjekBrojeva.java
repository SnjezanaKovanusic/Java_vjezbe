package nizovi;

import java.util.Scanner;

public class ProsjekBrojeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite deset decimalnih brojeva niza: ");
        double[] niz = new double[9];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = scanner.nextDouble();
        }

        System.out.println("Prosjek unesenih brojeva je: " + average(niz));
    }

    private static int average(int[] array) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        average = (double) sum / (double) array.length;
        return (int) average;
    }

    private static double average(double[] array) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        average = sum / array.length;
        return average;
    }
}
