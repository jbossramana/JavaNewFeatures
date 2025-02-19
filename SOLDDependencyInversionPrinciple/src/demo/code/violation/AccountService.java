package demo.code.violation;

//Service class for account-related operations
public class AccountService {
 private DatabaseAccountDao accountDao; // Violation: Direct dependency on DatabaseAccountDao

 public AccountService() {
     this.accountDao = new DatabaseAccountDao(); // Violation: Concrete class instantiated directly
 }

 public void createAccount(Account account) {
     // Validate account data...
     accountDao.save(account);
 }

 public Account getAccountById(int id) {
     // Perform any additional logic if needed...
     return accountDao.findById(id);
 }
 // Other account-related methods...
}