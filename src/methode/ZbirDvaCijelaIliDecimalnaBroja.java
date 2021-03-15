package methode;

public class ZbirDvaCijelaIliDecimalnaBroja {
    public static void main(String[] args) {
        int zbirIntegera = zbir(3, 3);
        double zbirDoublea = zbir(3.0, 3.0);
        System.out.println(zbir(3, 3));
        System.out.println(zbir(3.0, 3.0));
    }

    public static int zbir(int broj, int broj2) {
        int suma = broj + broj2;
        return suma;
    }

    public static double zbir(double broj, double broj2) {
        double suma = broj + broj2;
        return suma;
    }

}
