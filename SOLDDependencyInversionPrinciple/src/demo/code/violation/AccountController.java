package demo.code.violation;

//Controller for handling account-related HTTP requests
public class AccountController {
 private AccountService accountService;

 public AccountController() {
     this.accountService = new AccountService(); // Violation: Direct dependency on AccountService
 }

 // Method to handle HTTP POST request to create an account
 public void createAccount(String name, double balance) {
     Account account = new Account();
     account.setName(name);
     account.setBalance(balance);
     accountService.createAccount(account);
 }

 // Method to handle HTTP GET request to retrieve an account by ID
 public Account getAccountById(int id) {
     return accountService.getAccountById(id);
 }
 // Other methods for handling HTTP requests...
}