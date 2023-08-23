package chapter06.package1;

public class A {
    public A (boolean b){}
    A(int i){}//default
    private A(String s){}
    A a = new A("abc"); //같은 클래스 내부에서만 사용 가능
}
