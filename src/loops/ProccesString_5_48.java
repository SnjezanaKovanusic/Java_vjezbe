package loops;

public class ProccesString_5_48 {
    /*(Process string) Write a program that
    prompts the user to enter a string and displays the characters at odd positions
    * */
    public static void main(String[] args) {
        String unesenaRijec = "komutativnost";
        String svakoDrugoSlovo = "";

        for (int i = 0; i < unesenaRijec.length(); i++) {
            if (i % 2 != 0) {
                svakoDrugoSlovo += + unesenaRijec.charAt(i);

            }

        }
        System.out.println(svakoDrugoSlovo);
    }
}
