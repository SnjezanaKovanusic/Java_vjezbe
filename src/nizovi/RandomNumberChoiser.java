package nizovi;

import java.util.Arrays;

public class RandomNumberChoiser {
    /*(Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)*/
    public static void main(String[] args) {
        System.out.println(getRandom(1, 22, 33, 4, 5, 16, 7, 18, 9, 10));

    }

    public static int getRandom(int... numbers) {
        int random;
        int search;
        do {
            random = (int)(Math.random() * 54) + 1;
            search = Arrays.binarySearch(numbers, random);
        } while (search >= 0);
        return random;
    }
}
