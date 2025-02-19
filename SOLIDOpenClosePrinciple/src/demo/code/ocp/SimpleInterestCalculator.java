package demo.code.ocp;

public class SimpleInterestCalculator implements InterestCalculator {
	  private double interestRate;

	    public SimpleInterestCalculator(double interestRate) {
	        this.interestRate = interestRate;
	    }

	    @Override
	    public double calculateInterest(double balance, double interestRate) {
	        // Simple interest calculation
	        return balance * this.interestRate;
	    }

	    @Override
	    public double getInterestRate() {
	        return interestRate;
	    }
}