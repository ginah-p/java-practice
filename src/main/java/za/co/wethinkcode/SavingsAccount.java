package za.co.wethinkcode;

public class SavingsAccount extends Account{

    private final Money MINBALANCE = new Money( 0);
    private Money availableBalance = new Money( 0);
    private String accountName;

    public SavingsAccount() {
        accountName = "Savings Account";
    }

    public SavingsAccount(String accountName) {
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
        System.out.println("Insufficient Funds");
    }

//    private boolean insufficientFunds(Money debitAmount) {
//        return (availableBalance - debitAmount) < MINBALANCE;
//    }
}
