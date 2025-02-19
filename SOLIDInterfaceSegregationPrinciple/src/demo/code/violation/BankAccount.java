package demo.code.violation;

//BankAccount interface
public interface BankAccount {
 void deposit(double amount);
 void withdraw(double amount);
 double getBalance();
 void transfer(BankAccount destination, double amount);
}
