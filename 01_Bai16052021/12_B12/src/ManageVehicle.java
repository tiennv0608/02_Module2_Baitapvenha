import java.util.Scanner;

public class ManageVehicle {
    private Vehicle[] vehicles;
    int size;

    public ManageVehicle() {
        this.vehicles = new Vehicle[50];
        this.size = 0;
    }


    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles[size] = vehicle;
        size++;
    }

    public void displayVehicles() {
        for (int i = 0; i < size; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public int searchVehicle(String manufacturer, String color) {
        for (int i = 0; i < this.size; i++) {
            if (vehicles[i].getManufacturer().equals(manufacturer) && vehicles[i].getColor().equals(color)) {
                return i;
            }
        }
        return -1;
    }

    public void delete(String manufacturer, String color) {
        int index = searchVehicle(manufacturer, color);
        if (index != -1) {
            for (int i = index; i < size; i++) {
                vehicles[i] = vehicles[i + 1];
            }
            this.size--;
        } else {
            System.out.println("There is no vehicle in list");
        }

    }

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Delete Vehicle");
        System.out.println("3. Search Vehicle");
        System.out.println("0. Exit");
    }

    public void menuVehicle() {
        System.out.println("1. Add Car");
        System.out.println("2. Add MotorBike");
        System.out.println("3. Add Truck");
    }

    public Vehicle insertCar(Scanner scanner) {
        System.out.println("Enter Manufacturer");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter year of manufacture");
        int year = scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter color");
        String color = scanner.nextLine();
        System.out.println("Enter number of seat");
        int seat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter engine");
        String engine = scanner.nextLine();
        Vehicle car = new Car(manufacturer, year, price, color, seat, engine);
        return car;
    }

    public Vehicle insertMotorBike(Scanner scanner) {
        System.out.println("Enter Manufacturer");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter year of manufacture");
        int year = scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter color");
        String color = scanner.nextLine();
        System.out.println("Enter watt of motorbike");
        int watt = scanner.nextInt();
        scanner.nextLine();
        Vehicle motorBike = new MotorBike(manufacturer, year, price, color, watt);
        return motorBike;
    }

    public Vehicle insertTruck(Scanner scanner) {
        System.out.println("Enter Manufacturer");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter year of manufacture");
        int year = scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter color");
        String color = scanner.nextLine();
        System.out.println("Enter weight of Truck");
        int weight = scanner.nextInt();
        scanner.nextLine();
        Vehicle truck = new Truck(manufacturer, year, price, color, weight);
        return truck;
    }
}
