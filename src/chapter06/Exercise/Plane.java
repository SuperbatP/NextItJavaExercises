package chapter06.Exercise;

public class Plane {
    private String manufacturer;//제작사
    private String model;//비행기 모델명
    private int maxNumberOfPassengers;//최대 승객수
    private static int numberOfPlanes;//지금까지 생성된 비행기 객체의 수

    public Plane() {
     this(null, null, 0);
    }

    public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.numberOfPlanes++;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;}

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        if (maxNumberOfPassengers < 0){
        this.maxNumberOfPassengers = maxNumberOfPassengers;}
    }

    public static int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", maxNumberOfPassengers=" + maxNumberOfPassengers +
                '}';
    }
}
