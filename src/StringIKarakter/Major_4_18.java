package StringIKarakter;

import java.util.Scanner;

public class Major_4_18 {
    /*(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Unesite slovni karakter: M; C ili I: ");
        // String uneseniKarakter = scanner.next();
        // System.out.println("Unesite brojcani karakter: 1,2,3 ili 4: ");
        // int brojcaniKarakter = scanner.nextInt();
        String uneseniKarakter = "M";
        int brojcaniKarakter = 1;
        System.out.print("Student status: ");
        if (!(uneseniKarakter == "M" || uneseniKarakter == "C" || uneseniKarakter == "I")) {
            System.out.println("Invalid input");
        } else {

            switch (uneseniKarakter) {
                case "M":
                    System.out.print("Matematics");
                    break;
                case "C":
                    System.out.print("Computer Science");
                    break;
                case "I":
                    System.out.print("Information Technology");
                    break;

            }
            System.out.print(" ");
            switch (brojcaniKarakter) {
                case 1:
                    System.out.println("freshman");
                    break;
                case 2:
                    System.out.println("sophomore");
                    break;
                case 3:
                    System.out.println("junior");
                    break;
                case 4:
                    System.out.println("senior");
                    break;
                default:
                    System.out.println("\n" + "Invalid indicate, input must be 1, 2, 3 or 4! ");

            }
        }

    }
}
