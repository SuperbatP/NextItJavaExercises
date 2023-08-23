package chapter12;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.toString());
        System.out.println(s2.hashCode());
    }
}
