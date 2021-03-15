package methode;

public class ComisionSaMetodom {
    public static void main(String[] args) {
        System.out.println("Amount                 Comission");
        System.out.println("__________________________________");
        for (double amount = 100000; amount>=10000; amount-=5000){
            System.out.printf("%-16.0f", amount);
            System.out.printf("%8.1f\n",commisionMetoda(amount));
        }

    }
    public static double commisionMetoda (double amount) {
        double pomocnaVarijabla =0;
        double comision = 0;
        double zbirniKomision =0;
        if(amount <= 5000) {//5000

            comision += amount * 0.08;
            zbirniKomision += comision;

            amount = amount - 5000;


        } else if (amount >= 5001 && amount <= 10000) {
            amount = amount - 5000;

            comision += amount * 0.10;
            zbirniKomision += comision;


        } else if (amount > 10001) {
            pomocnaVarijabla = amount - 10000;//15000
            amount = amount - pomocnaVarijabla;//10000
            comision += pomocnaVarijabla * 0.12;
            zbirniKomision += comision;

        }
        return zbirniKomision;
    }

    }
