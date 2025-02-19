package demo.code.dip;

//Concrete implementation of AccountService
public class AccountService implements IAccountService {
 private IAccountDao accountDao;

 // Constructor injection for AccountDao
 public AccountService(IAccountDao accountDao) {
     this.accountDao = accountDao;
 }

 @Override
 public void createAccount(Account account) {
     // Validate account data...
     accountDao.save(account);
 }

 @Override
 public Account getAccountById(int id) {
     // Perform any additional logic if needed...
     return accountDao.findById(id);
 }
 // Other methods for account-related operations...
}