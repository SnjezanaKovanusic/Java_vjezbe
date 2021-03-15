package loops;

import java.util.Scanner;

public class findTheTwoHighestScore_5_9 {

    public static void main(String[] args) {
        // da se unese br studenata
        // klijent unosi ime studenta i broj bodova
        // program ispisuje ime i br bodova prvog
        // program ispisuje ime i br bodova drugog


        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = input.nextInt();
        int brojBodovaPrvog = 0;
        int brojBodovaDrugog = 0;
        String prvoIme = "";
        String drugoIme = "";


        for (int i = 0; i < brojStudenata; i++) {
            System.out.println("Unesite ime studenta " + (i + 1));
            String unesenoIme = input.next();
            System.out.println("Unesite broj bodova: ");
            int uneseniBodovi = input.nextInt();// 5 10 8

            if (uneseniBodovi > brojBodovaPrvog) {
                brojBodovaDrugog = brojBodovaPrvog;
                drugoIme = prvoIme;

                brojBodovaPrvog = uneseniBodovi;
                prvoIme = unesenoIme;
            }
            else if (uneseniBodovi > brojBodovaDrugog) {
                brojBodovaDrugog = uneseniBodovi;
            }

        }
        System.out.print("Najvise ima " + prvoIme + " ostvarenih bodova u iznosu od: " + brojBodovaPrvog);
        System.out.print(" a drugoplasirani je " + drugoIme + ", i ima " + brojBodovaDrugog + " bodova");
    }
}


