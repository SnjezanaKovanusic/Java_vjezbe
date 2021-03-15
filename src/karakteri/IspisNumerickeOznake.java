package karakteri;
import java.util.Scanner;
public class IspisNumerickeOznake {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ocjenu: ");
        String unos = scanner.nextLine();
        if (unos.equals("A")){
            System.out.println("Dobili ste 5");
        }
        else if (unos.equals("B")){
            System.out.println("Dobili ste 4");
        }
        else if (unos.equals("C")){
            System.out.println("Dobili ste 3");
        }
        else if (unos.equals("D")){
            System.out.println("Dobili ste 2");
        }
        else if (unos.equals("E")){
            System.out.println("Dobili ste 1");
        }
        else {
            System.out.println("Pogresan unos! ");
        }
    }
}
