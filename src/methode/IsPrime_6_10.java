package methode;

public class IsPrime_6_10 {

    public static void ispis() {
        int number = 100;
        for (int i = 1; i < number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");

            }
        }
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;

            }

        }
        return true;
    }
}
