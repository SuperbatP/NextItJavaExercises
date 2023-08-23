package chapter06.package2;

import chapter06.package1.A;

public class C {
    A a1 = new A(true);
  //  A a2 = new A(1); //default 는 패키지가 다르면 호출 불가능. - 같은 패키지만 가능.
  //  A a3 = new A("1");// private 라 생성자 호출 불가능
}
