package chapter06.example;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person();
     /*   p1.age = 20;
        p1.name = "홍길동";*/
        p1.setAge(20);//메소드를 통해 필드값을 변경
        p1.setName("홍길동");

        Person p2 = new Person();
        /*p2.age = 30;
        p2.name = "이순신";*/
        p1.setAge(30);//메소드를 통해 필드값을 변경
        p1.setName("이순신");

        System.out.println(p1.getName());

    }
}
