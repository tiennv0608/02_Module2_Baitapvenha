package main;

import java.util.Scanner;
import document.Document;
import document.Book;
import document.Magazine;
import document.Newspaper;
import manage.ManageDocument;

public class Test {
    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        ManageDocument manageDocument = new ManageDocument();
        while (size < 100) {
            System.out.println("Menu:");
            System.out.println("1. Add document.Document:");
            System.out.println("2. Delete document.Document:");
            System.out.println("3. Find document.Document:");
            System.out.println("4. Display list:");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("1. Add document.Book");
                    System.out.println("2. Add document.Magazine");
                    System.out.println("3. Add document.Newspaper");
                    System.out.println("Enter position:");
                    String position = scanner.nextLine();
                    switch (position) {
                        case "1":
                            System.out.println("Enter ID:");
                            int id = scanner.nextInt();
                            System.out.println("Enter publishingCompany:");
                            scanner.nextLine();
                            String publishingCompany = scanner.nextLine();
                            System.out.println("Enter Amount:");
                            int amount = scanner.nextInt();
                            System.out.println("Enter Author's Name:");
                            scanner.nextLine();
                            String authorName = scanner.nextLine();
                            System.out.println("Enter number of page:");
                            int numberOfPage = scanner.nextInt();
                            scanner.nextLine();
                            Document book = new Book(id, publishingCompany, amount, authorName, numberOfPage);
                            manageDocument.add(book);
                            System.out.println(book);
                            size++;
                            break;
                        case "2":
                            System.out.println("Enter ID:");
                            id = scanner.nextInt();
                            System.out.println("Enter publishingCompany:");
                            scanner.nextLine();
                            publishingCompany = scanner.nextLine();
                            System.out.println("Enter Amount:");
                            amount = scanner.nextInt();
                            System.out.println("Enter Release Number:");
                            int releaseNumber = scanner.nextInt();
                            System.out.println("Enter Release Month:");
                            scanner.nextLine();
                            String releaseMonth = scanner.nextLine();
                            Document magazine = new Magazine(id, publishingCompany, amount, releaseNumber, releaseMonth);
                            manageDocument.add(magazine);
                            System.out.println(magazine);
                            size++;
                            break;
                        case "3":
                            System.out.println("Enter ID:");
                            id = scanner.nextInt();
                            System.out.println("Enter publishingCompany:");
                            scanner.nextLine();
                            publishingCompany = scanner.nextLine();
                            System.out.println("Enter Amount:");
                            amount = scanner.nextInt();
                            System.out.println("Enter Release Day:");
                            scanner.nextLine();
                            String releaseDay = scanner.nextLine();
                            Document newspaper = new Newspaper(id, publishingCompany, amount, releaseDay);
                            manageDocument.add(newspaper);
                            System.out.println(newspaper);
                            size++;
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "2":
                    int numericalOrder = scanner.nextInt();
                    manageDocument.delete(numericalOrder);
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Enter name to find:");
                    int id = scanner.nextInt();
                    int index = manageDocument.find(id);
                    if (index != -1) {
                        System.out.println("The staff is in position " + (index + 1) + "in the list");
                    } else {
                        System.out.println("The staff is not in the list");
                    }
                    scanner.nextLine();
                    break;
                case "4":
                    manageDocument.display();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
