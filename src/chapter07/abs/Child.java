package chapter07.abs;

public class Child extends Parent{
    public String name;

    public Child(){
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name){
        //super();생략 
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
