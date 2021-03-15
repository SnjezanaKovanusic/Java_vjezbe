package methode;

import java.util.Scanner;

public class MyUtil {
    public static int inputInt(String message) {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static double inputDouble(String message) {
        System.out.print(message);

        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

}
