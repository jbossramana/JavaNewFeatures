package demo.code.isp;

//CheckingAccount class implementing both BankAccount and Transferable interfaces
public class CheckingAccount implements BankAccount, Transferable {
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

 @Override
 public void transfer(BankAccount destination, double amount) {
     // Transfer implementation
 }
}