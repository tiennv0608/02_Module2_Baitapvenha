import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageVehicle manageVehicle = new ManageVehicle();
        while (true) {
            manageVehicle.menu();
            System.out.println("Enter option");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    manageVehicle.menuVehicle();
                    System.out.println("Enter choice");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            Vehicle car = manageVehicle.insertCar(scanner);
                            System.out.println(car);
                            manageVehicle.addVehicle(car);
                            break;
                        case 2:
                            Vehicle motorBike = manageVehicle.insertMotorBike(scanner);
                            System.out.println(motorBike);
                            manageVehicle.addVehicle(motorBike);
                            break;
                        case 3:
                            Vehicle truck = manageVehicle.insertTruck(scanner);
                            System.out.println(truck);
                            manageVehicle.addVehicle(truck);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter manufacturer want to delete");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Enter color want to delete");
                    String color = scanner.nextLine();
                    manageVehicle.delete(manufacturer, color);
                    break;
                case 3:
                    System.out.println("Enter manufacturer want to search");
                    manufacturer = scanner.nextLine();
                    System.out.println("Enter color want to search");
                    color = scanner.nextLine();
                    int index = manageVehicle.searchVehicle(manufacturer, color);
                    System.out.println(manageVehicle.getVehicles()[index]);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong option, re input");
            }
        }
    }
}
