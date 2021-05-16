import java.util.Scanner;

public class ManageTeacher {
    private Teacher[] teachers = new Teacher[100];
    int size = 0;

    public void addTeacher(Teacher teacher) {
        teachers[size] = teacher;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(teachers[i]);
        }
    }

    public int searchTeacher(String id) {
        for (int i = 0; i < size; i++) {
            if (teachers[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Teacher[] deleteTeacher(String id) {
        int index = searchTeacher(id);
        if (index != -1) {
            for (int i = index; i < size; i++) {
                teachers[i] = teachers[i + 1];
            }
            size--;
        }
        return teachers;
    }

    public int calculateGrossSalary(String id) {
        int grossSalary = 0;
        int index = searchTeacher(id);
        grossSalary = teachers[index].getSalary() + teachers[index].getBonus() - teachers[index].getFine();
        return grossSalary;
    }
    public Teacher createTeacher(Scanner scanner){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter id");
        String id = scanner.nextLine();
        System.out.println("Enter salary");
        int salary = scanner.nextInt();
        System.out.println("Enter bonus");
        int bonus = scanner.nextInt();
        System.out.println("Enter fine");
        int fine = scanner.nextInt();
        Teacher teacher = new Teacher(name,age,address,id,salary,bonus,fine);
        return teacher;
    }
}
