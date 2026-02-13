public class ActiveState implements AccountState {
    @Override
    public void deposit(Double depositAmount) {

    }

    @Override
    public void withdraw(Double withdrawAmount) {

    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend() {
        System.out.println("Account is suspended!");
    }

    @Override
    public void close() {
        System.out.println("Account is closed!");
    }

    @Override
    public String toString() {

    }

}