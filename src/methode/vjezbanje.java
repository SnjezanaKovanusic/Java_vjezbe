
package methode;
import java.util.regex.*;

public class vjezbanje {
    public static void main(String[] args) {
        String sifra = "snjeza55";


        Pattern regex;
        regex = Pattern.compile("[^A-Za-z0-9 ]");
        Matcher matcher = regex.matcher(sifra);
        if (matcher.find()){
            // Do something
            System.out.println("ima specijalni karakter");
        }
        else {
            System.out.println("nema specijalni karakter");
        }
    }
}

