package methode;

public class AmountCommisino {
    public static void main(String[] args) {
        System.out.println(" Sales amount           Commision");
        for (double i = 10000; i <= 100000; i += 5000) {
            System.out.println("i = " + i);
            computeComission(i);
        }
    }

    public static void computeComission(double amount) {
        double commision = 0;
        double pomocna = 0;
        while (true) {
            amount += 0.01;

            if (amount < 5001) {
                commision = amount * 0.08;//399.92
                pomocna = amount;

            } else if (amount > 5001 && amount < 10000) {
                commision += (amount - pomocna) * 0.10;//899.92
                pomocna = amount;//9999

            } else if (amount > 10000) {
                if (commision >= 11700) {
                    break;
                }
                commision += (amount - pomocna) * 0.12;
                pomocna = amount;
            }
        }

    }
}

