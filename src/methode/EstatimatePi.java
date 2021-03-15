package methode;

public class EstatimatePi {
    public static double izracunajm(double i) {
        double rezultat = 0;
        for (double index = 1; index <= i; index++) {
            rezultat += Math.pow(-1, index + 1) / (2 * index - 1);

        }
        rezultat *= 4;
        return rezultat;
    }
}
