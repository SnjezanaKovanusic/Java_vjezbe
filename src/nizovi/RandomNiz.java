package nizovi;

import java.util.Scanner;

public class RandomNiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
        int niz = scanner.nextInt();
        int[] duzinaNiza = new int[niz];
        int randomNiz;
        for (int i = 0; i < duzinaNiza.length; i++) {
            randomNiz = (int) (Math.random() * 10);

            System.out.print(randomNiz + " ");
        }

    }
}
