package methode;

public class BrojDanaUGodini {
    public static void main(String[] args) {
        for (int broj = 2000; broj <= 2020; broj++) {
            System.out.println(broj + "  " + (brojDanaUGodnini(broj)));
        }
    }

    public static int brojDanaUGodnini(int godina) {
        if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}
