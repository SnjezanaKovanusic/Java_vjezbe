package methode;

public class SumDigits_6_2 {
    public static void main(String[] args) {
        int number = 255;
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
