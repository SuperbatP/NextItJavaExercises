package chapter06;

public class PersonExample {
    Person person;
    public static void main(String[] args) {
        //인스턴스
        Person person1 = new Person();//이때 Person()은 생성자. class가 아님! ㅇ0ㅇ!
                                      //그래서 무조건 new로 생성해야 함! ㅇ0ㅇ!!
        person1. name = "박보검";
        person1. age = 29;

        Person person2 = new Person();
        person2.name = "아이유";
        person2.age = 28;

        Person person3 = new Person();
        person2.name = "홍길동";
        person2.age = 35;

        Person person4 = new Person();
        System.out.println(person4.name); //초기값 출력

        /*void main {
            System.out.println(person.name);
        }*/
    }
}
