package demo.code.ocp;

public class Account {
    private double balance;
    private InterestCalculator interestCalculator;

    public Account(double balance, InterestCalculator interestCalculator) {
        this.balance = balance;
        this.interestCalculator = interestCalculator;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return interestCalculator.calculateInterest(balance, interestCalculator.getInterestRate());
    }
}