package se.lecixon.model;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public class Account {

    private Integer id;
    private String name;
    private AccountType accountType;
    private Long balance;

    public Account(String name, AccountType accountType, Long balance) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
