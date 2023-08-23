package chapter06.example;

public class ShopService {
    private static ShopService instance = new ShopService(); //1.생성자 하나는 만들어놔야함. 2.근데 객체 생성 못하니까 static

    //3.그리고 필드는 private //4.직접 접근 못하니까 메소드로 호출.->get/set
    private ShopService() { //생성자 막음.
    }

    public static ShopService getInstance() {

        return instance;
    }
}


