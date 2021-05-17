public class Vehicle {
    private String manufacturer;
    private int yearOfManufacture;
    private int price;
    private String color;

    public Vehicle(String manufacturer, int yearOfManufacture, int price, String color) {
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.color = color;
    }

    public Vehicle() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Manufacturer: '" + manufacturer + '\'' +
                ", year of manufacture:" + yearOfManufacture +
                ", price: " + price +
                ", color: '" + color + '\'';
    }
}
