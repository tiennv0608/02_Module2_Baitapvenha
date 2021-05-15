import java.time.LocalTime;

public class Car extends Vehicle implements ManageVehicle{
    private String brand;

    public Car() {
    }

    public Car(String name, LocalTime timeIn, String brand) {
        super(name, timeIn);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Vehicle[] addVehicle(Vehicle[] arrCar, int size) {
        for (int i = 0; i< size; i++) {
            arrCar[size] = new Car();
        }
        return arrCar;
    }

    @Override
    public Vehicle[] editVehicle(Vehicle[] arrCar, int size) {
        return null;
    }

    @Override
    public Vehicle[] deleteVehicle(Vehicle[] arrCar, int size) {
        return null;
    }

    @Override
    public Vehicle[] findVehicle(Vehicle[] arrCar, int size) {
        return null;
    }

    @Override
    public long costVehicle() {
        return 0;
    }
}
