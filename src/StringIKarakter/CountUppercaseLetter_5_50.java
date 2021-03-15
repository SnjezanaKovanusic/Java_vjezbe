package StringIKarakter;

public class CountUppercaseLetter_5_50 {
    public static void main(String[] args) {
        String unesenaRijec = "Dobrodosli u Javu";
        int countUppercase = 0;
        for (int i = 0; i < unesenaRijec.length(); i++) {
            int ch = unesenaRijec.charAt(i);
            if (ch >= 65 && ch <= 90) {
                countUppercase++;

            }
        }
        System.out.println(countUppercase);

    }
}
