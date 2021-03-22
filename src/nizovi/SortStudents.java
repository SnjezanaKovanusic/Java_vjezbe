package nizovi;

import MyUtil.PomocnaKlasa;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudents {
    /*(Sort students) Write a program that prompts the
    user to enter the number of students, the students’ names,
     and their scores,
     and prints student names in decreasing order of their scores*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] imena = {"A", "B", "C"};
        Integer[] bodovi = {34, 2, 25};
        System.out.println("Unesite broj bodova i ime studenta: ");
      /*  for (int i = 0; i < bodovi.length; i++) {
            bodovi[i] = scanner.nextInt();
            ime[i] = scanner.next();
        }

       */
        for (int i = 0; i < bodovi.length; i++) {
            for (int j = 0; j < bodovi.length; j++)
                if (bodovi[i] < bodovi[j]) {
                    zamjeniMjesta(bodovi, i, j);
                    zamjeniMjesta(imena, i, j);

                }
        }
        PomocnaKlasa.ispisiNiz(bodovi);
        PomocnaKlasa.ispisiNiz(imena);
    }

    private static void zamjeniMjesta(Object[] bodovi, int i, int j) {
        Object tmp = bodovi[i];
        bodovi[i] = bodovi[j];
        bodovi[j] = tmp;
    }

}
