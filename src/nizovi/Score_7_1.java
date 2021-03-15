package nizovi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Score_7_1 {
    public static void main(String[] args) {


    /*(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is Ú best - 10
Grade is B if score is Ú best - 20;
Grade is C if score is Ú best - 30;
Grade is D if score is Ú best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = scanner.nextInt();
        int[] nizBrojaStudenata = new int[brojStudenata];
        System.out.println("Unesite broj bodova studenata: ");
        Integer[] nizBodovaStudenata = new Integer[brojStudenata];
        for (int i = 0; i < nizBrojaStudenata.length; i++) {
            nizBodovaStudenata[i] = scanner.nextInt();

        }

        Collections.sort(Arrays.asList(nizBodovaStudenata));
        for (int i =0; i<nizBodovaStudenata.length; i++){
            System.out.println(nizBodovaStudenata[i]);
        }
    }
}
