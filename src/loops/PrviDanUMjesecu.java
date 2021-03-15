package loops;

public class PrviDanUMjesecu {
    public static void main(String[] args) {

        int year = 2013;
        int day = 2;
        String sadrzaj;

        for (int month = 1; month <= 12; month++) {
            sadrzaj = "";

            switch (month) {
                case 1 -> sadrzaj += "Januar";
                case 2 -> sadrzaj += "Februar";
                case 3 -> sadrzaj += "Mart";
                case 4 -> sadrzaj += "April";
                case 5 -> sadrzaj += "Maj";
                case 6 -> sadrzaj += "Jun";
                case 7 -> sadrzaj += "Jul";
                case 8 -> sadrzaj += "Avgust";
                case 9 -> sadrzaj += "Septembar";
                case 10 -> sadrzaj += "Oktobar";
                case 11 -> sadrzaj += "Novembar";
                case 12 -> sadrzaj += "Decembar";
            }

            sadrzaj += " 1, " + year + " is ";

            day %= 7;

            switch (day) {
                case 0 -> sadrzaj += " Nedjelja";
                case 1 -> sadrzaj += "Ponedeljak ";
                case 2 -> sadrzaj += " Utorak";
                case 3 -> sadrzaj += " Srijeda";
                case 4 -> sadrzaj += " Četvrtak";
                case 5 -> sadrzaj += " Petak";
                case 6 -> sadrzaj += " Subota";
            }

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                day += 31;
            if (month == 4 || month == 6 || month == 9 || month == 11)
                day += 30;
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                day += 29;
            else
                day += 28;



            System.out.println(sadrzaj);
        }


    }
}