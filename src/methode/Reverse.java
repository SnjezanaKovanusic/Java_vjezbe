package methode;

public class Reverse {
    public static void main(String[] args) {
        int number = 3456;
        getReverse(number);
        getIntReverse(number);
    }

    public static void getReverse(int rawNumb) {
        int reverse = 0;
        while (rawNumb != 0) {
            int digit = rawNumb % 10;  // dohvata zadnju cifru
            reverse = reverse * 10 + digit;   //rezultat mnozi sa 10 + zadnja cifra
            rawNumb /= 10;  // odbija zadnju cifru
        }
        System.out.println(reverse);
    }

    public static int getIntReverse(int num) {
        String reverse = "";
        String konvertovanaVarijabla = String.valueOf(num);
        for (int i = konvertovanaVarijabla.length() - 1; i >= 0; i--) {
            reverse += konvertovanaVarijabla.charAt(i);
        }
        System.out.println("reverse =" + reverse);
        return Integer.parseInt(reverse);
    }
}
