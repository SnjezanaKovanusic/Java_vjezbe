package loops;

import java.util.Scanner;

public class PozitivniINegativniBrojevi {
    public static void main(String[] args) {
        // 1. input integer, input ends with zero;
        // 2. determines how many postivie and negative numers valuse have been read;
        // 3. computes the total of the inputs values;
        //4. compute the average of the input values;
        Scanner input = new Scanner(System.in);
        int pozitivni = 0;
        int negativni = 0;
        int count = 0;
        int total = 0;
        System.out.println("Enter integer, program ends with zero! ");
        int unos = input.nextInt();
        if (unos == 0) {
            System.out.println("Nepostojeći unos! ");
            System.exit(1);
        }
        while (unos != 0) {

            if (unos > 0) {
                pozitivni++;
            }

            total += unos;
            count++;
            unos = input.nextInt();

        }
        System.out.println("Ukupno unesenih: : "+total + ", prosjek unesenih je: "+ total/count);

    }
}

