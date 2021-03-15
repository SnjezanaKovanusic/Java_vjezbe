package methode;

public class GameCraps_6_30 {
    public static void main(String[] args) {

        zaigraj();

    }

    private static void zaigraj() {
        int suma = bacanjeKockica();
        int point = pobjedaIliGubitak(suma);

        if (point == 1 || point == 2) {
            System.out.println(point == 1 ? "Pobjeda" : "Gubitak");
        }
        else {
            bacajDoKraja(point);
        }
    }

    public static int pobjedaIliGubitak(int suma) {
        if (suma == 2 || suma == 3 || suma == 12) {
            return 1;
        } else if (suma == 7 || suma == 11) {
            return 2;
        }

        return suma;
    }


    public static int kockica() {
        int broj=0;
        return broj = (int) (Math.random() * 6) + 1;
    }

    public static int bacanjeKockica() {
        int prvaKockica = kockica();
        int drugaKockica = kockica();
        int zbirKockica = prvaKockica + drugaKockica;
        System.out.println("Bacio si : " + prvaKockica + " + " + drugaKockica + " = " + zbirKockica);
        return zbirKockica;
    }

    public static void bacajDoKraja(int point) {
        int sum;

        do {
                                             //5
            System.out.println("point je: " + point);
            sum = bacanjeKockica();  //6
        } while (sum != point && sum != 7);
        System.out.println(sum == 7 ? "Izgubio si! " : "Pobjedio si! ");

    }

}
