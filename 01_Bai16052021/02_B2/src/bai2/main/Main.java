package bai2.main;

import java.util.Scanner;
import bai2.document.Document;
import bai2.document.Book;
import bai2.document.Magazine;
import bai2.document.Newspaper;
import bai2.manage.ManageDocument;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        ManageDocument manageDocument = new ManageDocument();
        while (size < 100) {
            System.out.println("Menu:");
            System.out.println("1. Add Document:");
            System.out.println("2. Delete Document:");
            System.out.println("3. Find Document:");
            System.out.println("4. Display list:");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("1. Add Book");
                    System.out.println("2. Add Magazine");
                    System.out.println("3. Add Newspaper");
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
                    System.out.println("Enter id want to delete:");
                    int numericalOrder = scanner.nextInt();
                    manageDocument.delete(numericalOrder);
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("1. Search Book");
                    System.out.println("2. Search Magazine");
                    System.out.println("3. Search Newspaper");
                    System.out.println("Enter type:");
                    String type = scanner.nextLine();
                    switch (type){
                        case "1":
                            manageDocument.searchByBook();
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("Wrong type");
                            break;
                    }
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
