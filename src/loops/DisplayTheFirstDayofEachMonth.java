package loops;

public class DisplayTheFirstDayofEachMonth {
    public static void main(String[] args) {
        int godina = 2021;
        int dan = 5;
        int mjesec;
        String ispis = "";

        for (mjesec = 1; mjesec <= 12; mjesec++) {

            switch (mjesec) {
                case 1:
                    System.out.print("Januar");
                    break;
                case 2:
                    System.out.print("Februar");
                    break;
                case 3:
                    System.out.print("Mart");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("Maj");
                    break;
                case 6:
                    System.out.print("Jun");
                    break;
                case 7:
                    System.out.print("Jul");
                    break;
                case 8:
                    System.out.print("Avgust");
                    break;
                case 9:
                    System.out.print("Septembar");
                    break;
                case 10:
                    System.out.print("Oktobar");
                    break;
                case 11:
                    System.out.print("Novembar");
                    break;
                case 12:
                    System.out.print("Decembar");
                    break;

            }
            ispis = "  1,  " + godina + " je ";

            System.out.print(ispis);
            dan %= 7;
            switch (dan) {
                case 0:
                    System.out.print("nedjelja");
                    break;
                case 1:
                    System.out.print("ponedjeljak");
                    break;
                case 2:
                    System.out.print("utorak");
                    break;
                case 3:
                    System.out.print("srijeda");
                    break;
                case 4:
                    System.out.print("cetvrtak");
                    break;
                case 5:
                    System.out.print("petak");
                    break;
                case 6:
                    System.out.print("subota");
                    break;
            }
            System.out.println("\n");
            if (mjesec == 1 || mjesec == 3 || mjesec == 5
                    || mjesec == 7 || mjesec == 8
                    || mjesec == 10 || mjesec == 12) {
                dan += 31;
            } else if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11) {
                dan += 30;
            } else {
                if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
                    dan += 29;
                } else {
                    dan += 28;
                }
            }

        }

    }

}
