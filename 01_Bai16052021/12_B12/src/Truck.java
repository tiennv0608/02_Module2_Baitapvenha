public class Truck extends Vehicle{
    private int weight;

    public Truck(String manufacturer, int yearOfManufacture, int price, String color, int weight) {
        super(manufacturer, yearOfManufacture, price, color);
        this.weight = weight;
    }

    public Truck() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck {" + super.toString() +
                ", weight: " + weight +
                "} ";
    }
}
