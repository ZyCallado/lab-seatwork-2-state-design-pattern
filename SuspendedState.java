public class SuspendedState implements AccountState {
    private Account account;

    public SuspendedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        account.balance += depositAmount;
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        account.balance -= withdrawAmount;
    }

    @Override
    public void activate() {
        System.out.println("Account is activated!");
        account.accountState = new ActiveState();
    }

    @Override
    public void suspend() {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close() {
        System.out.println("Account is closed!");
        account.accountState = new ClosedState();
    }

    @Override
    public String toString() {
        String output = "";
        output += "Account number: " + account.accountNumber + 
                  "\nCurrent balance: " + account.balance;
        return output;
    }
}