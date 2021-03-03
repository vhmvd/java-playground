public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public Account(Account other) {
        this.balance = other.balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}