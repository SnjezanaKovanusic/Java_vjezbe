package nizovi;

public class IsSorted {
    /*(Sorted?) Write the following method that returns true if the list is already sorted
in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether
the list is sorted or not. Here is a sample run. Note that the first number in the
input indicates the number of the elements in the list. This number is not part
of the list. */
    public static void main(String[] args) {
        int[] niz = {1, 3, 2, 4};
        if (isSorted(niz)) {
            System.out.println("Alredy sorted!");
        } else {
            System.out.println("Array not sorted!!");
        }

    }

    private static boolean isSorted(int[] niz) {
        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] > niz[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

