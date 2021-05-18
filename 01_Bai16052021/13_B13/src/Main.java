import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageEmployee manageEmployee = new ManageEmployee();
        Employee employee1 = new Experience("VN161536","Nguyen Viet Tien","06/08/1994","0919882694","tiennv0608@gmail.com",0,5,"Negotiation");
        Employee employee2 = new Experience("VN169766","Nguyen Van A","07/01/1995","0919234694","afg@gmail.com",0,2,"Negotiation");
        manageEmployee.addEmployee(employee1);
        manageEmployee.addEmployee(employee2);
        Employee employee3 = new Fresher("VN161732","Trinh Thi T","26/10/1998","0356782721","trinht@gmail.com",1,"25/6/2016","Kha","LTK");
        Employee employee4 = new Fresher("VN211732","Tran Thi T","19/12/1996","0356783541","tri@gmail.com",1,"25/6/2018","Xuat Sac","DHHP");
        manageEmployee.addEmployee(employee3);
        manageEmployee.addEmployee(employee4);
        Employee employee5 = new Intern("VN192837","Nguyen Thi B","05/02/2001","09342376399","gef@gmail.com",2,"Ke toan",4,"DHKHXHNV");
        Employee employee6 = new Intern("VN124327","Nguyen Thi D","15/2/1996","0934230829","abc@gmail.com",2,"Kinh te",6,"DHKT-DHQG");
        manageEmployee.addEmployee(employee5);
        manageEmployee.addEmployee(employee6);
        manageEmployee.displayList();
        System.out.println(Employee.employeeCount);
        manageEmployee.editEmployee("VN161732",scanner);
        manageEmployee.deleteEmployee("VN16153");
        System.out.println("================");
        manageEmployee.displayList();
        manageEmployee.searchEmployee(0);
        System.out.println("================");
        manageEmployee.searchEmployee(1);
        System.out.println("================");
        manageEmployee.searchEmployee(2);
        System.out.println("================");
    }
}
