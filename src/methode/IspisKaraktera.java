package methode;

public class IspisKaraktera {
    public static void main(String[] args) {
        int prviKaratker = MyUtil.inputInt("Unesite pocetak ispisa karaktera: ");
        int drugiKarakter = MyUtil.inputInt("Unesite kraj ispisa karaktera: ");
        int count = MyUtil.inputInt("Unesite broj karaktera u redu:  ");

        String isprintaniKarakteri = ispisKaraktera(prviKaratker, drugiKarakter, count);
        System.out.println(isprintaniKarakteri);
    }

    public static String ispisKaraktera(int prvi, int drugi, int brojac) {
        StringBuilder msg = new StringBuilder();
        for (int i = prvi; i <= drugi; i++) {
            brojac++;
            if (brojac % 10 == 0) {
                msg.append((char) i).append("\n ");
            } else {
                msg.append((char) i).append(" ");
            }

        }
        return msg.toString();

    }

}
