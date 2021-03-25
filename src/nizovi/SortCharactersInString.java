package nizovi;

import java.util.Arrays;

public class SortCharactersInString {
    /*(Sort characters in a string) Write a method that returns a sorted string using the
following header:
public static String sort(String s)
For example, sort("acb") returns abc.
Write a test program that prompts the user to enter a string and displays the sorted
string.*/
    public static void main(String[] args) {
        String rijec = "voooojislav";
        String sort = sortPjeske(rijec);

        System.out.println(sort);

    }

    private static String sort(String rijec) {
        char sortirana[] = rijec.toCharArray();
        Arrays.sort(sortirana);
        return String.valueOf(sortirana);
    }

    private static String sortPjeske(String rijec) {
        char sotiranaRijec[] = new char[rijec.length()];
        for (int i = 0; i < sotiranaRijec.length; i++) {
            sotiranaRijec[i] = rijec.charAt(i);
        }
        Arrays.sort(sotiranaRijec);
        String sortiraniString = "";
        for (int i = 0; i < sotiranaRijec.length; i++) {
            sortiraniString += sotiranaRijec[i];
        }
        System.out.println(sortiraniString);
        return sortiraniString;
    }
}
