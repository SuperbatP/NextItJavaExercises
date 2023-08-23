package chapter06.example;

public class Member {
    String name;
    String id;
    String password;

    int age;

    public Member() {
    }

    public Member(String name, String id) { // 값 주입->스프링에서 많이 사용할 용어.
        this.name = name;
        this.id = id;
    }

}