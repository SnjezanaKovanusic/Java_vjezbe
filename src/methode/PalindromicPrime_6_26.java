package methode;

public class PalindromicPrime_6_26 {

    public static void ispisiPrvihSto() {
        int brojacPrvihSto = 0;
        int brojKojiSeIspituje = 2;
        while (true) {
            if (brojacPrvihSto == 100) {
                break;
            }
            if (isPalindrom(brojKojiSeIspituje) && isPrime(brojKojiSeIspituje)) {
                System.out.println(" " + brojKojiSeIspituje);
                brojacPrvihSto++;
            }
            brojKojiSeIspituje++;

        }
    }


    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }


        }
        return true;


    }

    public static boolean isPalindrom(int number) {
        int reverse = 0;
        int orginal = number;
        while (number != 0) {
            int digit = number % 10;  // dohvata zadnju cifru
            reverse = reverse * 10 + digit;   //rezultat mnozi sa 10 + zadnja cifra
            number /= 10;  // odbija zadnju cifru
        }
        return reverse == orginal;
    }
}
