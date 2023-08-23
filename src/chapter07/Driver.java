package chapter07;

public class Driver {
    public void drive(Vehicle vehicle){//매개변수를 bus나 taxi로 넣으면 그것밖에 못사용.->상위 객체를 넣어줘야 다형성 적용.
        vehicle.run();
    }
}
