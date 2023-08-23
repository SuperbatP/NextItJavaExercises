package chapter08.Exercise;

public class Example {
    public static void action(A a) {//매개변수는 같거나 하위클래스만 가능 A a = newB()
        a.method1();
        //A a = newC(); 일 경우에도 a.method2()는 사용 불가능.
        if (a instanceof C c) {
            c.method2();
        }
        /*if (a instanceof C) {
            C c = (C) a;
            c.method2();
        }*/
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}
