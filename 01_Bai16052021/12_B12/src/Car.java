public class Car extends Vehicle{
    private int seat;
    private String engine;

    public Car(String manufacturer, int yearOfManufacture, int price, String color, int seat, String engine) {
        super(manufacturer, yearOfManufacture, price, color);
        this.seat = seat;
        this.engine = engine;
    }

    public Car() {
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car {" + super.toString() +
                ", seat:" + seat +
                ", engine:'" + engine + '\'' +
                "} ";
    }

}
