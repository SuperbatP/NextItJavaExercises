package chapter08.Example;

public abstract class BankAccount {
    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > 0) {
            balance -= amount;
        }
        return false;
    }

    public boolean transfer(int amount, BankAccount otherAccount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            otherAccount.deposit(amount);
            return true;
        }
    }

    abstract String getAccountType();

    @Override
    public String toString() {
        return "잔액: " + balance;
    }
}
