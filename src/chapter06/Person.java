package chapter06;

public class Person {
    //main 은 확인하려고 쓰는거라 클래스 단게에서는 안 쓸 거임.
    //클래스 생성
    //필드는 선언만 하면 자동으로 default 값으로 초기화 되어있어서 초기값을 따로 쓸 필요 없음.
    //어차피 많은 인스턴스를 만들기 위함으로, 값을 지정하는 게 무의미함. ex)사람 이름은 다 다르다.
    String name; //이름을 저장하는 객체 선언
    int age; //나이를 저장하는 객체 선언

    String nation;
    //생성자-자동으로 컴파일에는 만들어 줘서 쓰지 않아도 생성자를 쓸 수 있음.

    public Person() {
    }
    //생성자가 하나라도 있으면, 자동으로 기본 생성자가 만들어지지 않음.
    //개발자따라 다른데, 오류를 최소화하기 위해 기본 생성자도 만들자.
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(int age ,String name) { //매개변수 순서가 달라도 가능.
        this.age = age;
        this.name = name;
    }
/*

    public Person(String name, String nation) { //매개변수 타입이 같으면 오류
        this.nation = nation;
        this.name = name;
    }
    //Person("   ", "   ") 형태일 때 어떤 것이 name인지 nation인지 모르니까!
    public Person(String nation,String name) {
        this.name = name;
        this.nation = nation;
    }
*/

}