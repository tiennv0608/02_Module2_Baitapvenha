import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add student");
            System.out.println("2. Display list");
            System.out.println("3. Display 20 years old Student");
            System.out.println("4. Count 23 years old Student at DN");
            System.out.println("5. Exit");
            System.out.println("Enter choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Student age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student Hometown:");
                    String homeTown = scanner.nextLine();
                    System.out.println("Enter Student class:");
                    String className = scanner.nextLine();
                    Student student = new Student(name, age, homeTown, className);
                    school.add(student);
                    break;
                case 2:
                    school.display();
                    break;
                case 3:
                    school.display20YearsOldStudent();
                    break;
                case 4:
                    int count = school.count23YearsOldAtDN();
                    System.out.println("Number of students 23 years old at DN are: " + count);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
