package loops;

public class SumASeries_5_24 {
    public static void main(String[] args) {
        /*Write a program to sum the following series: 1/3+3/5...97/99;*/

        double sum = 0.0;
        double sum2 = 0.0;
        double rez = 0.0;
        for (double n = 1.0, j = 3.0; n < 97.0 && j <= 99.0; n += 2, j += 2) {
            sum += n;
            sum2 += j;
            rez += n / j;

        }
        System.out.println(sum + " "+ sum2);
        System.out.println("Sum of series: " + rez);
    }
}


































