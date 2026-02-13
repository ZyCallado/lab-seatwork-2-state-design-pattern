public class SuspendedState implements AccountState {
    private Account account;

    public SuspendedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        System.out.println("You cannot deposit on a suspended account!");
        System.out.println(toString());
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        System.out.println("You cannot withdraw on a suspended account!");
        System.out.println(toString());
    }

    @Override
    public void activate() {
        System.out.println("Account is activated!");
        account.accountState = new ActiveState(account);
    }

    @Override
    public void suspend() {
        System.out.println("Account is already suspended!");
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