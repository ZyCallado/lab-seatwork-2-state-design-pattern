public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(); // default state
    }

    public void deposit(Double depositAmount) {

    }

    public void withdraw(Double withdrawAmount) {

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

    public String toString() {
        
    }

}