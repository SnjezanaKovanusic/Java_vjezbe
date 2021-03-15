package nizovi;

import java.util.Arrays;

public class Duplikati {
    /*Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a test program that reads in ten integers, invokes the method, and displays
the result. Here is the sample run of the program:*/
    public static void main(String[] args) {
        int[] niz = {1, 1, 2};
        //System.out.println(Arrays.toString(eleministiDuplikate(niz)));
        for (int i =0; i<niz.length; i++){
            for (int j=0; j<niz.length; j++){
                System.out.print("i"+i);
                System.out.print( "J: "+j+ " ");
            }
        }
    }

    private static int[] eleministiDuplikate(int[] lista) {
        int duzina = lista.length;
        int[] privremena = new int[lista.length];
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] == lista[j]) {
                    privremena[i] = lista[j];
                }
            }
        }

        return privremena;
    }
}
/*public static int[] removeDuplicates(int[] arr){
    int end = arr.length;

    for (int i = 0; i < end; i++) {
        for (int j = i + 1; j < end; j++) {
            if (arr[i] == arr[j]) {
                /*int shiftLeft = j;
                for (int k = j+1; k < end; k++, shiftLeft++) {
                    arr[shiftLeft] = arr[k];
                }*/
// arr[j] = arr[end-1];
//      end--;
//          j--;
                    /*    }
                        }
                        }

                        int[] whitelist = new int[end];
    /*for(int i = 0; i < end; i++){
        whitelist[i] = arr[i];
    }*/
//   System.arraycopy(arr, 0, whitelist, 0, end);
//   return whitelist;
//   }*/*/