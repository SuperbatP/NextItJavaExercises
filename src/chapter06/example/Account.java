package chapter06.example;

public class Account {

   private String accountNumber;//계좌번호
   private String holder;//예금주
   private int balance;
//--------------------------필드-------------------------------------//
    public Account() {
    }

    public Account(String accountNumber, String holder, int balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }
//--------------------------생성자-----------------------------------------//
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }
    //---------------------------메소드--------------------------------//
}
