package chapter06.example;

public class AccountEx19 {
    private int balance; //필드를 private로 설정하면 왠만하면 메소드를 생성해주자(getter & setter)
    static final int MIN_BALANCE = 0; //상수 접근 지정자 : public static final
    static final int MAX_BALANCE = 1_000_000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance <= MIN_BALANCE || balance >= MAX_BALANCE) {
            return;
        } else {
            this.balance = balance;
        }

        /*  if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        } 조건값을 달리하면 한 줄 코드로 반환가능.*/
    }
}
