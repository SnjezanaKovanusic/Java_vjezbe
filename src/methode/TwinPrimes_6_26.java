package methode;

public class TwinPrimes_6_26 {
    public static void main(String[] args) {
        ispisiTwinPrimes();
    }

    public static void ispisiTwinPrimes() {
        System.out.println("Twin primes: " + "\n" + "------------");
        for (int i = 3; i < 100; i++) {

            if (isPrime(i) % 2 != 0) {
                System.out.print("\t" + i + " ");
                System.out.println(i + 2);
            }
        }
    }

    /*(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
Write a program to find all twin primes less than 1,000. Display the output as follows:
(3, 5)
(5, 7)
*/

    private static int isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {

            }

        }
        return number;
    }
}
