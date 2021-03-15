package loops;

public class CompareLoansWithVariousInterestRates_5_21 {
    public static void main(String[] args) {
        double annualInterestRate = 5.0;
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfYears = 5;
        double lonanAmount = 10000;


        System.out.println(" Interest rate " + " Monthly Payment " + " Total Payment ");

        for (annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125) {
            monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = lonanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.println(annualInterestRate + "           " + monthlyPayment + "     " + totalPayment);


        }


    }
}
