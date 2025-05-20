package za.co.wethinkcode;

public class CreditAccount extends Account{

    private Money availableBalance = new Money(20000);
    private String accountName;

    public CreditAccount() {
        accountName = "Credit Account";
    }

    public CreditAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public Money getAvailableBalance() {
        return availableBalance;
    }

    @Override
    public String accountName() {
        return accountName;
    }

    @Override
    public void renameAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void creditAccount(Money creditAmount) {
        availableBalance = creditAmount;
    }

    @Override
    public void debitAccount(Money debitAmount) {
        availableBalance = debitAmount;
    }
}
