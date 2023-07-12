package chapter02;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x =5, y=10, temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
        System.out.println("x는 "+x+" y는 "+y);
    }
}
