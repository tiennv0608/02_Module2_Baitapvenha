import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        do {
            int choice = -1;
            int option = -1;
            customerManagementMenu();
            int choice1 = studentManagement.checkInputType(choice);
            switch (choice1) {
                case 1:
                    studentManagement.addStudent();
                    break;
                case 2:
                    studentManagement.display();
                    break;
                case 3:
                    List<Student> studentList = studentManagement.searchStudentById();
                    if (studentList.size() == 0) {
                        System.out.println("No information!");
                    } else {
                        Student student = studentList.get(0);
                        studentManagement.displaySearchList();
                        editingMenu();
                        int option1 = studentManagement.checkInputType(option);
                        switch (option1) {
                            case 1:
                                studentManagement.editName(student);
                                break;
                            case 2:
                                studentManagement.editBirthDay(student);
                                break;
                            case 3:
                                studentManagement.editGender(student);
                                break;
                            case 4:
                                studentManagement.editAddress(student);
                                break;
                            case 5:
                                studentManagement.editEmail(student);
                                break;
                            case 6:
                                studentManagement.editScore(student);
                                break;
                            case 7:
                                studentManagement.editInformation(student);
                                break;
                            default:
                                System.out.println("Invalid!");
                        }
                    }
                    break;
                case 4:
                    studentManagement.deleteStudentById();
                    break;
                case 5:
                    searchingMenu();
                    int option1 = studentManagement.checkInputType(option);
                    switch (option1) {
                        case 1:
                            studentManagement.searchStudentById();
                            studentManagement.displaySearchList();
                            break;
                        case 2:
                            studentManagement.searchStudentByName();
                            studentManagement.displaySearchList();
                            break;
                        case 3:
                            studentManagement.searchStudentByAgeRange();
                            studentManagement.displaySearchList();
                            break;
                        case 4:
                            studentManagement.searchStudentByScoreRange();
                            studentManagement.displaySearchList();
                            break;
                        default:
                            System.out.println("Invalid!");
                    }
                    break;
                case 6:
                    studentManagement.sort();
                    break;
                case 7:
                    studentManagement.writeToFile();
                    break;
                case 8:
                    try {
                        studentManagement.readFromFile();
                        studentManagement.display();
                    } catch (IOException e) {
                        System.out.println("File not found!");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input, re input (0-6):");
            }
        } while (true);
    }

    static void customerManagementMenu() {
        System.out.println("Student Management");
        System.out.println("1. Add student");
        System.out.println("2. Display Student list");
        System.out.println("3. Edit student");
        System.out.println("4. Delete student");
        System.out.println("5. Search student");
        System.out.println("6. Sort list");
        System.out.println("7. Write to File");
        System.out.println("8. Read from File");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    static void searchingMenu() {
        System.out.println("Searching menu");
        System.out.println("1. Search student by ID");
        System.out.println("2. Search student by name");
        System.out.println("3. Search student by age range");
        System.out.println("4. Search student by score range");
        System.out.print("Enter your option: ");
    }

    static void editingMenu() {
        System.out.println("Editing menu");
        System.out.println("1. Edit name");
        System.out.println("2. Edit birthday");
        System.out.println("3. Edit gender");
        System.out.println("4. Edit address");
        System.out.println("5. Edit email");
        System.out.println("6. Edit score");
        System.out.println("7. Edit whole information");
        System.out.print("Enter your option: ");
    }

}
