package main;

import manage.ManageStaff;
import person.Engineer;
import person.Officier;
import person.Staff;
import person.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        ManageStaff manageStaff = new ManageStaff();
        while (size < 100) {
            System.out.println("Menu:");
            System.out.println("1. Add Staff:");
            System.out.println("2. Find Staff:");
            System.out.println("3. Display Staff:");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("1. Add Worker");
                    System.out.println("2. Add Engineer");
                    System.out.println("3. Add Officier");
                    System.out.println("Enter position:");
                    String position = scanner.nextLine();
                    switch (position) {
                        case "1":
                            System.out.println("Enter name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter age:");
                            int age = scanner.nextInt();
                            System.out.println("Enter gender:");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.println("Enter address:");
                            String address = scanner.nextLine();
                            System.out.println("Enter level:");
                            int level = scanner.nextInt();
                            scanner.nextLine();
                            Staff worker = new Worker(name, age, gender, address, level);
                            manageStaff.add(worker);
                            System.out.println(worker);
                            size++;
                            break;
                        case "2":
                            System.out.println("Enter name:");
                            name = scanner.nextLine();
                            System.out.println("Enter age:");
                            age = scanner.nextInt();
                            System.out.println("Enter gender:");
                            scanner.nextLine();
                            gender = scanner.nextLine();
                            System.out.println("Enter address:");
                            address = scanner.nextLine();
                            System.out.println("Enter major:");
                            String major = scanner.nextLine();
                            Staff engineer = new Engineer(name, age, gender, address, major);
                            manageStaff.add(engineer);
                            System.out.println(engineer);
                            size++;
                            break;
                        case "3":
                            System.out.println("Enter name:");
                            name = scanner.nextLine();
                            System.out.println("Enter age:");
                            age = scanner.nextInt();
                            System.out.println("Enter gender:");
                            scanner.nextLine();
                            gender = scanner.nextLine();
                            System.out.println("Enter address:");
                            address = scanner.nextLine();
                            System.out.println("Enter job:");
                            String job = scanner.nextLine();
                            Staff officier = new Officier(name, age, gender, address, job);
                            manageStaff.add(officier);
                            System.out.println(officier);
                            size++;
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Enter name to find:");
                    String name = scanner.nextLine();
                    int index = manageStaff.find(name);
                    if (index != -1) {
                        System.out.println("The staff is in position " + (index + 1) + "in the list");
                    } else {
                        System.out.println("The staff is not in the list");
                    }
                    ;
                    break;
                case "3":
                    manageStaff.display();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
