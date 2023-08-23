package chapter06.example;

public class Singleton {

    private static Singleton instance =new Singleton(); //2 생성자를 사용하지 못하니까, 생성자가 필요없는 static를 붙임.
    //3. 필드에 static를 붙이는 건 위험한 행동. 필드에 private를 붙임.

    private Singleton(){} //1 한개의 객체만 만들어주고, 다른 곳에서 못 사용하게 함

    public static Singleton getInstance(){ //4. 필드에 붙어진 private 때문에 직접 호출 못하니까 메서드를 통해 호출
        //5. 그런데 생성자를 하나밖에 못 만드니까 또 static를 붙임.
        //6. 이 메소드는 다른 곳에서 써야하니까 다시 public 할당,
        return instance;
    }
}
