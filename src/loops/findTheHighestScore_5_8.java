package loops;

import java.util.Scanner;

public class findTheHighestScore_5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Unesite broj studenata: ");
        int brojStudenata = input.nextInt();
        int najviseBodova = 0;
        String najviseIme = " ";

        for (int i = 0; i < brojStudenata; i++) {
            System.out.println("Unesite ime studenta " + (i + 1));
            String ime = input.next();
            System.out.println("Unesite broj bodova: ");
            int bodovi = input.nextInt();

            if (bodovi > najviseBodova) {
                najviseBodova = bodovi;
                najviseIme = ime;
            }
        }
        System.out.println(" Najvise ima " + najviseIme + " ostvarenih bodova u iznosu od: " + najviseBodova);

    }
}
