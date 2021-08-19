package Entities.Abstracts;
import Entities.concretes.Account;

public interface AccountManager {
    void signUp(Account account);
    void delete(Account account);
    void update(Account account);

}
