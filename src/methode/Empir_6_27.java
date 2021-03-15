package methode;

public class Empir_6_27 {
    public static void main(String[] args) {

        ispisEmpirBrojeva();

    }

    private static void ispisEmpirBrojeva() {
        int brojacPrvihSto = 0;
        int brojKojiSeIspituje = 2;
        int brojRedova = 0;

        while (brojacPrvihSto != 100) {

            if (isEmpir(brojKojiSeIspituje)) {
                brojRedova++;
                System.out.print(brojKojiSeIspituje + (brojRedova % 10 == 0 ? "\n" : " "));
                brojacPrvihSto++;
            }
            brojKojiSeIspituje++;
        }
    }


    private static boolean isEmpir(int num) {
        return (!isPalindrom(num) && isPrime(num) && isPrime(reverse(num)));
    }

    private static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;  // dohvata zadnju cifru
            reverse = reverse * 10 + digit;   //rezultat mnozi sa 10 + zadnja cifra
            number /= 10;  // odbija zadnju cifru
        }
        return reverse;
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;


    }

    private static boolean isPalindrom(int number) {
        return number == reverse(number);
    }
}

