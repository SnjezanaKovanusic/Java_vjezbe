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

    public static void ispisiNiz(Object[] reverse) {
        for (Object n : reverse) {
            System.out.print(" " + n);
        }
    }    public static void ispisiNiz(String[] reverse) {
        for (String n : reverse) {
            System.out.print(" " + n);
        }
    }
}
