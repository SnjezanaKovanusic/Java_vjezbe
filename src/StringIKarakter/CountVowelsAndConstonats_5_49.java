package StringIKarakter;

public class CountVowelsAndConstonats_5_49 {
    public static void main(String[] args) {
        int countVolvels = 0;
        int countConstonats = 0;

        String unos = "kOmutAtivnost";

        for (int i = 0; i < unos.length(); i++) {
            char ch = unos.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u'
            || ch == 'A'|| ch == 'E'|| ch== 'O'|| ch== 'U'|| ch== 'I'|| ch == 'i') {
                countVolvels++;
            } else {
                countConstonats++;
            }

        }
        System.out.println(countVolvels +" "+  countConstonats);
    }
}
