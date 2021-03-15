package methode;

public class CommissionDrugiNacin {
    public static void main(String[] args) {
        double amount = 100000;
        double comision = 0;
        double pomocnaVarijabla;
        double zbirniKomision = 0;

        while (true) {
            if (amount > 10001) {
                pomocnaVarijabla = amount - 10000;//15000
                amount = amount - pomocnaVarijabla;//10000
                comision = pomocnaVarijabla * 0.12;
                zbirniKomision+=comision;
                System.out.println("comision = " + comision);

            } else if (amount >= 5001 && amount <= 10000) {
                amount = amount - 5000;

                comision = amount * 0.10;
                zbirniKomision+=comision;
                System.out.println("comision = " + comision);

            } else if (amount <= 5000) {//5000

                comision = amount * 0.08;
                zbirniKomision+=comision;
                System.out.println("comision = " + comision);
                amount = amount - 5000;
                if (amount <= 0) {
                    break;
                }

            }


        }
        System.out.println("zbirniKomision = " + zbirniKomision);

    }
}
