package nizovi;

import java.util.Arrays;

public class IdenticalArray_7_27 {
    /*(Identical arrays) The arrays list1 and list2 are identical if they have the
same contents. Write a method that returns true if list1 and list2 are identical, using the following header:
public static boolean equals(int[] list1, int[] list2)Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical. Here are the sample runs. Note that the first
number in the input indicates the number of the elements in the list. This number
is not part of the list.*/
    public static void main(String[] args) {
        int [] niz1 = {1,2,3,4};
        int [] niz2= {1,2,3,4};
        if (equals(niz1,niz2)){
            System.out.println("true"+ Arrays.toString(niz1));
        }
        else {
            System.out.println("false");
        }

    }
    private static boolean equals (int [] list1, int [] list2){

        for (int i =0;i<list1.length; i++ ){
            if (Arrays.equals(list1,list2)){
                return true;
            }
        }return false;
    }
}
