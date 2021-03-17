package MyUtil;

import java.util.Scanner;

public class PomocnaKlasa {
    public static int[] unesiNiz(int brojUnosa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite " + brojUnosa + " integera. ");
        int[] niz = new int[brojUnosa];
        for (int i = 0; i < brojUnosa; i++) {
            niz[i] = scanner.nextInt();
        }
        return niz;
    }
    public static double[] unesiNiz(double brojUnosa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite " + brojUnosa + " integera. ");
        double[] niz = new double[(int) brojUnosa];
        for (int i = 0; i < brojUnosa; i++) {
            niz[i] = scanner.nextInt();
        }
        return niz;
    }

    public static void ispisiNiz(int[] reverse) {
        for (int n : reverse) {
            System.out.print(" " + n);
        }
    }
}
