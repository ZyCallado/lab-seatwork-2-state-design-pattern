public class Account {
    public String accountNumber;
    public Double balance;
    public AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    public void deposit(Double depositAmount) {
        accountState.deposit(depositAmount);
    }

    public void withdraw(Double withdrawAmount) {
        accountState.withdraw(withdrawAmount);
    }

    public void activate() {
        accountState.activate();
    }

    public void suspend() {
        accountState.suspend();
    }

    public void close() {
        accountState.close();
    }
}