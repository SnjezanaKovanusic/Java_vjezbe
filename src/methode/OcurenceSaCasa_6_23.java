package methode;

public class OcurenceSaCasa_6_23 {

    public static int count(String unos, char karakter) {
        int brojac = 0;
        for (int i = 0; i < unos.length(); i++) {
            if (karakter == unos.charAt(i)) {
                brojac++;

            }
        }
        return brojac;
    }

}
