package methode;

public class SumDigitsSaCasa {
    public static int sumDigits(int number) {
        int suma = 0;
        while (number > 0) {
            int digit = number % 10;
            suma += digit;
            number /= 10;
        }
        return suma;
    }
}
