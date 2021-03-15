package loops;

public class ComputeFutureTuition_5_7 {
    public static void main(String[] args) {
        //skolarina iznosi 10.000, kamata je 5% svake godine, izračunaj školarinu za prvih deset godina i četiri godine
        //nakon proteka od deset
        int skolarina = 10000;
        double kamata = 0.05;
        int skolarinaZaDesetGodina = 0;
        int skolarinaZaCetiriGodine = 0;


        for (int i = 1; i <= 14; i++) {

            skolarina += (skolarina * kamata);
            System.out.println(skolarina);

            if (i == 10) {
                skolarinaZaDesetGodina += skolarina;

            }
            if (i > 10) {
                skolarinaZaCetiriGodine += skolarina;
            }

        }
        System.out.println("Skolarina za deset godina je " +
                skolarinaZaDesetGodina + " , a skolarina za cetrnaest godina je " +
                skolarinaZaCetiriGodine);

    }


}

