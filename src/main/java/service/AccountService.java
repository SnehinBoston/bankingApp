package service;
import java.util.List;
import java.util.Optional;

import model.Accounts;

public interface AccountService {
    void saveAccount(Accounts Id);
    Accounts getAccountsById(Long id);
}
