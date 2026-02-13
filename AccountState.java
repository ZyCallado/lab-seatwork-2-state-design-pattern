public interface AccountState {
    public void deposit(Double depositAmount);
    public void withdraw(Double withdrawAmount);
    public void activate();
    public void suspend();
    public void close();
    public String toString(); // displays account number and balance
}