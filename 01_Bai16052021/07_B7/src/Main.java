import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageTeacher manageTeacher = new ManageTeacher();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add teacher");
            System.out.println("2. Display list");
            System.out.println("3. Calculate Gross Salary");
            System.out.println("4. Delete teacher");
            System.out.println("5. Exit");
            System.out.println("Enter your choice (1-5):");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    Teacher teacher = manageTeacher.createTeacher(scanner);
                    manageTeacher.addTeacher(teacher);
                    System.out.println(teacher);
                    break;
                }
                case 2: {
                    manageTeacher.display();
                    break;
                }
                case 3: {
                    System.out.println("Enter id");
                    String id = scanner.nextLine();
                    int grossSalary = manageTeacher.calculateGrossSalary(id);
                    System.out.println("Gross salary of id " + id + " is " + grossSalary);
                    break;
                }
                case 4: {
                    System.out.println("Enter id");
                    String id = scanner.nextLine();
                    manageTeacher.deleteTeacher(id);
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Wrong choice, choose again:");
                }
            }
        }
    }
}
