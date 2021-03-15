package StringIKarakter;

public class SocijaniBrojSnjeza {
    public static void main(String[] args) {
        String unos = "121-11-1534";
        boolean validna = true;
        if (unos.length() != 11) {
            validna = false;
            System.out.println("Duzina unosa je nepravilna! ");
        } else {
            for (int i = 0; i < unos.length(); i++) {
                if (i == 3 || i == 6) {
                    if (!(unos.charAt(i) == '-')) {
                        validna = false;
                        System.out.println("Crtica nije na pravom mjestu! ");
                        break;
                    }
                }
                if (!(i == 3 || i == 6)) {
                    if (!Character.isDigit(unos.charAt(i))) {
                        validna = false;
                        System.out.println("Broj nije na pravom mjestu");
                        break;
                    }
                }
            }
        }
        if (validna == true) {
            System.out.println("validna");
        }
    }
}
