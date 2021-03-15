package loops;

public class PrimeNumber_5_20 {
    public static void main(String[] args) {

        final int NUMBERS_OF_PRIMES = 1000;
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < 11) {
            boolean isPrime = true;
            number++;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(number);
            }

        }

    }
}
