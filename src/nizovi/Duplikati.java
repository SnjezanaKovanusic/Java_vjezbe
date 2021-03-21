package nizovi;

import MyUtil.PomocnaKlasa;

import java.util.Arrays;

public class Duplikati {
    /*Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a test program that reads in ten integers, invokes the method, and displays
the result. Here is the sample run of the program:*/
    public static void main(String[] args) {
        int[] niz = {1, 2, 1, 2, 1, 3, 2, 1, 1, 1, 1, 1, 45, 1, 1, 1, 46};
        PomocnaKlasa.ispisiNiz(bezDuplih(niz));
    }

    public static int[] bezDuplih(int[] niz) {
        int[] bezDuplih = new int[0];

        for (int i = 0; i < niz.length; i++) {
            if (!contains(niz[i], bezDuplih)) {
                bezDuplih = noviNizBezDuplihELemenata(niz[i], bezDuplih);
            }
        }
        return bezDuplih;
    }

    private static int[] noviNizBezDuplihELemenata(int noviBroj, int[] temp) {
        int novaDuzina = temp.length + 1;
        int[] prosireniNiz = new int[novaDuzina];
        for (int i = 0; i < prosireniNiz.length - 1; i++) {
            prosireniNiz[i] = temp[i];
        }
        prosireniNiz[prosireniNiz.length - 1] = noviBroj;
        return prosireniNiz;
    }

    private static boolean contains(int broj, int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (broj == niz[i]) {
                return true;
            }
        }
        return false;
    }

    private static int[] eleministiDuplikate(int[] lista) {

        int[] bezDuplih = new int[lista.length];


        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] != bezDuplih[j]) {
                    bezDuplih[i] = lista[i];
                } else {


                }
            }
        }

        return bezDuplih;
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