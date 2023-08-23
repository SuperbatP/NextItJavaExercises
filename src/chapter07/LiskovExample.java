package chapter07;

public class LiskovExample {
    public static void main(String[] args) {
        Parent child = new Child();
        Child c = (Child) child;
        child.method2();
    }
}
