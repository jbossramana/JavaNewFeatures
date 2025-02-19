package demo.code.isp;

//Transferable interface for accounts that support fund transfers
public interface Transferable {
 void transfer(BankAccount destination, double amount);
}