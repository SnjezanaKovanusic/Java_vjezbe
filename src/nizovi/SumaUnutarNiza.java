package nizovi;

import java.util.Scanner;

public class SumaUnutarNiza {
    public static void main(String[] args) {
        int[] nizBrojeva = new int[3];
        double sumaUnesenihOcjena = 0;
        int brojacOcijenaIznadProsjeka = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println("Unesite broj na poziciju " + i);
            nizBrojeva[i] = scanner.nextInt();
            sumaUnesenihOcjena += nizBrojeva[i];
        }
        double prosjek = sumaUnesenihOcjena / nizBrojeva.length;
        for (int i = 0; i < nizBrojeva.length; i++) {
            if (prosjek < nizBrojeva[i]) {
                brojacOcijenaIznadProsjeka++;
            }

        }
        System.out.println(prosjek + " " + brojacOcijenaIznadProsjeka + " " + sumaUnesenihOcjena);
    }
}
