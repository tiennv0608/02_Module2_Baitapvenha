public class MotorBike extends Vehicle {
    private int wattage;

    public MotorBike(String manufacturer, int yearOfManufacture, int price, String color, int wattage) {
        super(manufacturer, yearOfManufacture, price, color);
        this.wattage = wattage;
    }

    public MotorBike() {
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "MotorBike {" + super.toString() +
                ", wattage: " + wattage +
                "} ";
    }
}
