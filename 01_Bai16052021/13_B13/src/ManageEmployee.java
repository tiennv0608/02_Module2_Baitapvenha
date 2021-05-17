import java.util.Scanner;

public class ManageEmployee {
    private Employee[] employees;
    int size;

    public ManageEmployee() {
        this.employees = new Employee[1000];
        this.size = 0;
    }

    public void addEmployee(Employee employee) {
        this.employees[size] = employee;
        size++;
    }

    public void displayList() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.employees[i]);
        }
    }

    public int searchEmployee(String id) {
        for (int i = 0; i < this.size; i++) {
            if (this.employees[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public void editEmployees(Scanner scanner,int index){
        System.out.println("Edit ID");
        this.employees[index].setId(scanner.nextLine());
        System.out.println("Edit full name");
        this.employees[index].setFullName(scanner.nextLine());
        System.out.println("Edit birthday");
        this.employees[index].setBirthDay(scanner.nextLine());
        System.out.println("Edit phone");
        this.employees[index].setPhone(scanner.nextLine());
        System.out.println("Edit email");
        this.employees[index].setEmail(scanner.nextLine());
        System.out.println("Edit employee type");
        this.employees[index].setEmployeeType(scanner.nextInt());
        scanner.nextLine();
    }

    public void editExperience(Scanner scanner, int index) {
        editEmployees(scanner,index);
        System.out.println("Edit exp in year");
        ((Experience) this.employees[index]).setExpInYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Edit pro skill");
        ((Experience) this.employees[index]).setProSkill(scanner.nextLine());
    }
    public void editFresher(Scanner scanner, int index) {
        editEmployees(scanner,index);
        System.out.println("Edit graduation date");
        ((Fresher) this.employees[index]).setGraduationDate(scanner.nextLine());
        System.out.println("Edit graduation rank");
        ((Fresher) this.employees[index]).setGraduationRank(scanner.nextLine());
        System.out.println("Edit education");
        ((Fresher) this.employees[index]).setEducation(scanner.nextLine());
    }
    public void editIntern(Scanner scanner, int index) {
        editEmployees(scanner,index);
        System.out.println("Edit major");
        ((Intern) this.employees[index]).setMajors(scanner.nextLine());
        System.out.println("Edit semester");
        ((Intern) this.employees[index]).setSemester(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Edit university name");
        ((Intern) this.employees[index]).setUniversityName(scanner.nextLine());
    }

    public void editEmployee(String id, Scanner scanner) {
        int index = searchEmployee(id);
        if (index == -1) {
            System.out.println("There is no employee in the list");
        } else {
            if (this.employees[index] instanceof Experience) {
                editExperience(scanner,index);
            } else if (this.employees[index] instanceof Fresher) {
                editFresher(scanner,index);
            } else {
                editIntern(scanner,index);
            }
        }
    }
    public void deleteEmployee(String id) {
        int index = searchEmployee(id);
        if (index !=-1) {
            for (int i = index; i<this.size-1;i++) {
                this.employees[i] = this.employees[i+1];
            }
            this.size--;
        }
    }
}
