package methode;

public class BrojDanaUGodiniSaCasa {
    public static int brojDanaUGodnini(int godina) {
        if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}
/* Iz mejna: int unos = BrojDanaUGodiniSaCasa.brojDanaUGodnini(2000);
        System.out.println("Broj dana u godini: " + unos);*/