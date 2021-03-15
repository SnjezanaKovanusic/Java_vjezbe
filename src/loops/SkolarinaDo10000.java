package loops;

public class SkolarinaDo10000 {
    public static void main(String[] args) {
        //skolarina = 5000, procenat uvecanja = 7%

        double skolarina = 5000;
        double procenatUvecanja = 0.07;
        int uduplanaSkolarina = 10000;
        int godina = 0;

        while (skolarina <= uduplanaSkolarina) {
            godina++;
            skolarina += (skolarina * procenatUvecanja);

            System.out.println(skolarina);
        }
        System.out.println(godina);


    }
}
