import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageEmployee manageEmployee = new ManageEmployee();
        Employee employee1 = new Experience("VN161536","Nguyen Viet Tien","06/08/1994","0919882694","tiennv0608@gmail.com",0,5,"Negotiation");
        manageEmployee.addEmployee(employee1);
        Employee employee2 = new Fresher("VN161732","Trinh Thi T","26/10/1998","0356782721","trinht@gmail.com",1,"25/6/2016","Kha","LTK");
        manageEmployee.addEmployee(employee2);
        Employee employee3 = new Intern("VN192837","Nguyen Thi B","15/2/1996","0934230829","abc@gmail.com",2,"Kinh te",6,"DHKT-DHQG");
        manageEmployee.addEmployee(employee3);
        manageEmployee.displayList();
        System.out.println(Employee.employeeCount);
        manageEmployee.editEmployee("VN161732",scanner);
        manageEmployee.deleteEmployee("VN16153");
        manageEmployee.displayList();
    }
}
