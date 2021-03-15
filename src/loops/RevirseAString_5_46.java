package loops;

public class RevirseAString_5_46 {
    public static void main(String[] args) {
        /*
        *5.46 (Reverse a string) Write a program that prompts the user to enter a string and
displays the string in reverse order.*/

        String rijec = "Vojislav";

        for (int i = rijec.length(); i>0; --i){
            System.out.print(rijec.charAt(i-1));
        }
    }

}
