package methode;

public class SumSeries_6_13 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i <= 20; i++) {
            System.out.print(i + "   " + (sum += sumSeries(i)));
            System.out.println();

        }
    }

    public static double sumSeries(double prosljedjeniBroj) {
        return (prosljedjeniBroj / (prosljedjeniBroj + 1));
    }
}

