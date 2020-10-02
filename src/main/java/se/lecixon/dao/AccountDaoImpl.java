package se.lecixon.dao;

import se.lecixon.dao.sequencers.AccountSequencer;
import se.lecixon.model.Account;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public class AccountDaoImpl implements AccountDao {

    private Set<Account> accounts = new HashSet<>();

    @Override
    public Account save(Account account) {
        if (account.getId() == null) {
            account.setId(AccountSequencer.nextId());
            accounts.add(account);
        } else {
            Optional<Account> accountOptional = findById(account.getId());
            Account original = accountOptional.orElseThrow(IllegalArgumentException::new);
            original.setName(account.getName());
            original.setBalance(account.getBalance());
        }
        return account;
    }

    @Override
    public boolean delete(Integer id) {
        Account account = findById(id).orElseThrow(IllegalArgumentException::new);
        return accounts.remove(account);
    }

    @Override
    public Optional<Account> findById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        return accounts.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
}
