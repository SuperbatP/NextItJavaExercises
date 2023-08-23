package chapter11.Example;

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
        if (amount > balance || amount < 0) {
            throw new IllegalArgumentException("해당하는 금액을 보낼 수 없습니다.");
        } else if (otherAccount == null) {
            throw new NullPointerException("해당하는 계좌가 없습니다.");
        }
        return false;
    }

    abstract String getAccountType();

    @Override
    public String toString() {
        return "잔액: " + balance;
    }
}
