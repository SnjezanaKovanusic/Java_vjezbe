package StringIKarakter;

import methode.MyUtil;

public class ASCIITabela_4_8 {
    /*8 (Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character.*/
    public static void main(String[] args) {
        int uneseniBroj = MyUtil.inputInt("Unesite broj od 0 do 127: ");
        char ch = (char) uneseniBroj;

        System.out.println("Uneseni broj je karakter u ASCII tabeli: " + ch);
    }
}
