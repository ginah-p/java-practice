package za.co.wethinkcode;

public class BusinessAccount extends Account{

    private Money availableBalance = new Money(0);
    private String accountName;

    public BusinessAccount() {
        accountName = "Business Account";
    }

    public BusinessAccount(String accountName) {
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
