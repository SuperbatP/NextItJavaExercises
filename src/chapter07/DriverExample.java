package chapter07;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Bus());
        //Vehicle vehicle = new Bus();
        //driver.drive(vehicle);

        driver.drive(new Taxi());
        driver.drive(new Vehicle());

        Vehicle v = new Bus();
        Bus bus = (Bus) v;
        bus.cheakFee();

        ((Bus)v).cheakFee();;

        method(new Vehicle());
    }
    public static void method(Vehicle vehicle){
        if(vehicle instanceof Bus bus){
            bus.cheakFee();
        } else {
            System.out.println("캐스팅할 수 없습니다.");
        }
    }
}
