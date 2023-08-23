package chapter07.Exam05;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount[] accounts;
    private int numberOfAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new BankAccount[5]; // 최대 5개의 계좌 생성 가능
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public BankAccount getAccount(int index) {
        return accounts[index];
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void addAccount(BankAccount account) {
        accounts[numberOfAccounts++] = account;
    }

    @Override
    public String toString() {
        return String.format("이름: %s %s, 계좌의 개수 : %d", firstName, lastName, numberOfAccounts);
    }
}