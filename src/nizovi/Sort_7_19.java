package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_7_19 {
    /*(Sorted?) Write the following method that returns true if the list is already sorted
in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether
the list is sorted or not. Here is a sample run. Note that the first number in the
input indicates the number of the elements in the list. This number is not part
of the list. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite brojeve: ");
        int unos = scanner.nextInt();
        int [] niz= new int[unos];
        for (int i = 0; i<unos; i++){
            niz[i]+= scanner.nextInt();

        }
        if (isSorted(niz)){
            System.out.println("sortiran ");
        }
        else {
            System.out.println("nije sortiran");
        }


    }
    private static boolean isSorted (int [] list){
        int [] copyList =new int [list.length];
        for (int i= 0; i<list.length;i++){
            copyList[i]+=list[i];
        }
        Arrays.sort(copyList);
        if (Arrays.equals(copyList,list)){
            return true;
        }
        return false;
    }
}
