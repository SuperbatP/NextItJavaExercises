package chapter06.example;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) { // 값을 셋팅하니까 매개변수 필요함.
        if (age > 0) {//나이는 음수가 있을 수 없으니까, 조건을 추가함.
            this.age = age;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {//get : 가져오는 것. 매겨변수 없고, 리턴타입에 값을 넣어줌.
        return age;
    }

    public String getName() {
        return name;
    }
}
