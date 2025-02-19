package demo.code.ocp;

public class CompoundInterestCalculator implements InterestCalculator {
	 private double interestRate;

	    public CompoundInterestCalculator(double interestRate) {
	        this.interestRate = interestRate;
	    }

	    @Override
	    public double calculateInterest(double balance, double interestRate) {
	        // Compound interest calculation
	        // Example formula: balance * (1 + interestRate)^n - balance
	        // For simplicity, let's assume n = 1 (yearly)
	        return balance * Math.pow(1 + this.interestRate, 1) - balance;
	    }

	    @Override
	    public double getInterestRate() {
	        return interestRate;
	    }
}