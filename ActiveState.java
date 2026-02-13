public class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        account.balance += depositAmount;
        System.out.println("Deposited successfully!");
        System.out.println(toString());
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        account.balance -= withdrawAmount;
        System.out.println("Withdrawn successfully!");
        System.out.println(toString());
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend() {
        System.out.println("Account is suspended!");
        account.accountState = new SuspendedState(account);
    }

    @Override
    public void close() {
        System.out.println("Account is closed!");
        account.accountState = new ClosedState(account);
    }

    @Override
    public String toString() {
        String output = "";
        output += "Account number: " + account.accountNumber + 
                  "\nCurrent balance: " + account.balance;
        return output;
    }
}