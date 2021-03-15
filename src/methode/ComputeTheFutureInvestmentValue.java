package methode;

public class ComputeTheFutureInvestmentValue {
    public static void main(String[] args) {
        double amount = 1000;
        double interestRate = 0.09;
        double monthlyInterest = interestRate / 12;
        System.out.println("Years         Futuure value ");
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-10d", years);
            System.out.println(futureInvestmentValue(amount, monthlyInterest, years));
        }
    }

    public static double futureInvestmentValue(double amount, double interest, int year) {
        double futureInvestment = amount * Math.pow(1 + interest, year * 12);
        return futureInvestment;

    }
}
