package bai3;

import bai3.constestant.ClassA;
import bai3.constestant.ClassB;
import bai3.constestant.ClassC;
import bai3.constestant.Constestant;
import bai3.manage.ManageConstestant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        ManageConstestant manageConstestant = new ManageConstestant();
        while (size < 100) {
            System.out.println("Menu:");
            System.out.println("1. Add Constestant:");
            System.out.println("2. Display list:");
            System.out.println("3. Find Constestant:");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("1. Add Constestant Class A");
                    System.out.println("2. Add Constestant Class B");
                    System.out.println("3. Add Constestant Class C");
                    System.out.println("Enter position:");
                    String position = scanner.nextLine();
                    switch (position) {
                        case "1":
                            manageConstestant.add(createConstestant(scanner, "a"));
                            size++;
                            break;
                        case "2":
                            manageConstestant.add(createConstestant(scanner, "b"));
                            size++;
                            break;
                        case "3":
                            manageConstestant.add(createConstestant(scanner, "c"));
                            size++;
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "2":
                    manageConstestant.display();
                    break;
                case "3":
                    System.out.println("Enter Id to find:");
                    String id = scanner.nextLine();
                    int index = manageConstestant.find(id);
                    if (index != -1) {
                        System.out.println("The constestant is in position " + (index + 1) + " in the list");
                    } else {
                        System.out.println("The constestant is not in the list");
                    }
                    scanner.nextLine();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice, pick 1-4");
                    break;
            }
        }
    }

    public static Constestant createConstestant(Scanner scanner, String block) {
        System.out.println("Enter ID:");
        String id = scanner.nextLine();
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Address:");
        String address = scanner.nextLine();
        System.out.println("Enter priority:");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (block.equals("a")) {
            return new ClassA(id, name, address, priority);
        } else if (block.equals("b")) {
            return new ClassB(id, name, address, priority);
        } else {
            return new ClassC(id, name, address, priority);
        }
    }
}
