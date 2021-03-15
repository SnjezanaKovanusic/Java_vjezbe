package loops;

import methode.MyUtil;

public class CompoundValue_5_30 {
    public static void main(String[] args) {
        int account = MyUtil.inputInt("Unesite neku sumu: ");
        double montlyInterest = MyUtil.inputDouble("Ener montly interest: ");
        double precentInFloat = montlyInterest / 100;
        double monthlyInterestRate = precentInFloat / 12;
        double stanjeNaRacunu = 0;
        double amount = 0;

        for (int month = 0; month < 6; month++) {
            stanjeNaRacunu = (stanjeNaRacunu + account) * (monthlyInterestRate + 1);
            amount += stanjeNaRacunu;
            System.out.println(stanjeNaRacunu);
        }
        System.out.println(" amount = " + amount);
    }
}
