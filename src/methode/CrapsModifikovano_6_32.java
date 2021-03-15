package methode;

public class CrapsModifikovano_6_32 {
    public static void izracunajBrojPobjeda() {
        int zbirPobjeda = 0;
        for (int i = 0; i < 10000; i++) {
            zbirPobjeda += zaigraj();
        }
        System.out.println(zbirPobjeda);
    }

    private static int zaigraj() {
        int sumaBacanjaKockica = bacanjeKockica();
        int point = pobjedaIliGubitak(sumaBacanjaKockica);

        if (point == 1) {
            return 1;
        }
        return bacajDoKraja(point);
    }

    private static int pobjedaIliGubitak(int suma) {
        if (suma == 2 || suma == 3 || suma == 12) {
            return 1;
        } else if (suma == 7 || suma == 11) {
            return 2;
        }

        return suma;
    }


    private static int kockica() {
        int broj;
        return broj = (int) (Math.random() * 6) + 1;
    }

    private static int bacanjeKockica() {
        int prvaKockica = kockica();
        int drugaKockica = kockica();
        int zbirKockica = prvaKockica + drugaKockica;

        return zbirKockica;
    }

    private static int bacajDoKraja(int point) {
        int sum = 0;
        int brojac = 0;
        while (sum != point && sum != 7) {
            sum = bacanjeKockica();
            if (sum == point) {
                return 1;
             } else if (sum == 7) {
                break;
            }
        }
        return 0;

    }

}


