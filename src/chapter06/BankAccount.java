package chapter06;

public class BankAccount {
   static int balance;//잔고

    void deposit(int amount) { //입금
        balance += amount; // static 사용가능
    }

    void withdraw(int amount) { //출금
        balance -= amount;
    }
}
