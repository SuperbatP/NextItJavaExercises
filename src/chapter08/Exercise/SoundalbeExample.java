package chapter08.Exercise;

public class SoundalbeExample {
    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
public static class Cat implements Soundable{
    @Override
    public String sound() {
        return "야옹";
    }
}

public static class Dog implements Soundable{
    @Override
    public String sound() {
        return "멍멍";
    }
}

    public static void main(String[] args) {
    printSound(new Cat());
    printSound(new Dog());

    }
}
