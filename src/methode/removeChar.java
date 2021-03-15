package methode;

public class removeChar {
    public static void main(String[] args) {
        String str = "Vojo77";
        char ch = '7';
       // String noviString = removeChar(str, ch);
        String novi = str.replace(ch,' ');
        System.out.println(novi);
    }

    public static String removeChar(String str, char ch) {
        String rjesenje = " ";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
              //  rjesenje+= str.charAt(i);

            }
        }
        return str;
    }
}
