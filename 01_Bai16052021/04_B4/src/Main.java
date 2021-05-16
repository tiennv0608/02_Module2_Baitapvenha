import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of family:");
        int number = scanner.nextInt();
        scanner.nextLine();
        Family[] families = new Family[number];
        for (int i =0; i<number;i++){
            System.out.println("Enter address:");
            int address = scanner.nextInt();
            System.out.println("Enter number of member:");
            int numberOfMember = scanner.nextInt();
            Person[] persons = new Person[numberOfMember];
            scanner.nextLine();
            for (int j =0; j <numberOfMember;j++){
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter job:");
                String job = scanner.nextLine();
                System.out.println("Enter Id:");
                int id = scanner.nextInt();
                scanner.nextLine();
                persons[j] = new Person(name,age,job,id);
            }
            families[i] = new Family(number,persons,address);
            town.add(families[i]);
        }
        town.display();
    }
}
