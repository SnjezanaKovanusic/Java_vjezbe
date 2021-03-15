package loops;

import methode.MyUtil;

public class BrojDjeljivSaTrinaest {
    public static void main(String[] args) {
int uneseniBroj = MyUtil.inputInt("Unesite broj kao krajnju granicu");

        for (int i = 1; i <= uneseniBroj; i++) {
            if (i % 13 == 0) {
                System.out.print(i+ " ");
            }
        }

    }
}

