package loops;

public class LoanAmortizationSchedule_5_22 {

    public static void main(String[] args) {
        double lonanAmount = 10000;
        double annualInterestRate = 0.07;

        int numberOfYears = 1;
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = lonanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        double balance = lonanAmount;
        double principal, interest;


        System.out.println("Monthly Payment : " + monthlyPayment);
        System.out.println("Total Payment : " + totalPayment);



        System.out.println(" Payment# " + "    " + "Inetrest " + "               " + "Principal " + "           " + "Balance ");

        for (int i = 1; i < numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance -=  principal;
            System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);


        }


    }
}