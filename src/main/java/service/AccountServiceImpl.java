package service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Accounts;
import repository.AccountRepository;

import javax.swing.text.html.Option;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void saveAccount(Accounts account) {
        this.accountRepository.save(account);
    }

    @Override
    public Accounts getAccountsById(Long id){
        Optional <Accounts> x = Optional.ofNullable(accountRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("Account %s not found", id))));
        Accounts accounts = null;
        if (x.isPresent()) {
            accounts = x.get();
        } else {
            throw new RuntimeException(" Account not found for id :: " + id);
        }
        return accounts;
    }
}