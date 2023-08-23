package chapter07;

public class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");

    }
    public void cheakFee() {
        System.out.println("요금을 확인합니다.");

    }
}
