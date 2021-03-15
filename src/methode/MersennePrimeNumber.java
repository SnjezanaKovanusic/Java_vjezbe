package methode;
/*6.28 (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 in the form 2p - 1 for some positive integer p. Write a program that finds all
 Mersenne primes with p … 31 and displays the output as follows:
 p 2^p –1
 2 3
 3 7
 5 31
 ...*/

public class MersennePrimeNumber {
    public static void main(String[] args) {

        ispisMersenn();

    }

    private static void ispisMersenn() {
        for (int i = 2; i <= 31; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                System.out.println(mersenneNumber(i));
            }

        }
    }

    private static int mersenneNumber(int number) {
        return (int) Math.pow(2, number) - 1;
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
