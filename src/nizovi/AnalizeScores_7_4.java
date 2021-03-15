package nizovi;

/*(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.*/
public class AnalizeScores_7_4 {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(prosjekBrojeva(niz));
    }

    private static int prosjekBrojeva(int[] niz) {
        int suma = 0;
        double prosjek = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        int brojac = 0;
        prosjek = suma / niz.length;
        for (int i = 0; i < niz.length; i++) {
            if (prosjek >= niz[i]) {
                brojac++;

            }
        }
        return brojac;
    }

}
