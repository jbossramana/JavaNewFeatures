package demo.code.isp;

//SavingsAccount class implementing BankAccount interface only
public class SavingsAccount implements BankAccount {
 private double balance;

 @Override
 public void deposit(double amount) {
     // Deposit implementation
 }

 @Override
 public void withdraw(double amount) {
     // Withdraw implementation
 }

 @Override
 public double getBalance() {
     // Get balance implementation
     return balance;
 }
}