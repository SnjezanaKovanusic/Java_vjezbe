package StringIKarakter;

import java.util.Scanner;

public class UnosOcijena {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Unesite ocjenu slovnu: ");
        String ocjena = scanner.next();

        switch (ocjena.toUpperCase()){
            case "A":
                System.out.println("5");break;
            case "B":
                System.out.println("4");break;
            case "C":
                System.out.println("3");break;
            case "D":
                System.out.println("2");break;
            case "E":
                System.out.println("1");break;

        }
    }
}
