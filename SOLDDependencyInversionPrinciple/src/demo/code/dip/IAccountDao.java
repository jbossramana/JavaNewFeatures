package demo.code.dip;

//Interface for AccountDao
public interface IAccountDao {
 void save(Account account);
 Account findById(int id);
 // Other methods for data access...
}