package StringIKarakter;

public class BrojVelikihIMalihSlova {
    public static void main(String[] args) {
        int brojacMalih = 0;
        int brojacVelikih = 0;
        String unesenaRijec = "Dobro dosli u Javu";

        for (int i = 0; i < unesenaRijec.length(); i++) {
            if (Character.isLowerCase(unesenaRijec.charAt(i))) {
                brojacMalih++;
            } else if (Character.isUpperCase(unesenaRijec.charAt(i))) {
                brojacVelikih++;
            }
        }
        System.out.println("brojacVelikih = " + brojacVelikih);
        System.out.println("brojacMalih = " + brojacMalih);
    }
}
