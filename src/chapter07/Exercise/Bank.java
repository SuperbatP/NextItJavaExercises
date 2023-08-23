package chapter07.Exercise;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    //customers을 배열로 만들어서, null 체크를 안하려고 카운팅용을 하나 만듦.

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(Customer customer) {
        customers[numberOfCustomers++] = customer;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}
