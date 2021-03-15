package loops;

import methode.MyUtil;

public class PogadjanjeBroja {
    public static void main(String[] args) {
        double generisaniBroj = (int) (Math.random() * 10);
        System.out.println(generisaniBroj);
        int pogadjanje = 0;
        while (true) {
            pogadjanje = MyUtil.inputInt("Pogodite generisani broj! ");
            if (generisaniBroj == pogadjanje) {
                System.out.println("Cestitamo! Pogodili ste broj! ");
                break;
            } else if (pogadjanje < generisaniBroj) {
                System.out.println("Uneseni broj je manji od generisanog, pokusajte sa vecim!");
            } else if (pogadjanje > generisaniBroj) {
                System.out.println("Uneseni broj je veci od generisanog, pokusajte sa manjim! ");
            }
        }
    }
}