import java.io.IOException;
import java.util.*;

public class StudentManagement {
    List<Student> list;
    List<Student> searchingList = null;
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();

    public StudentManagement() {
        try {
            list = ReadAndWrite.readFile("student.csv");
        } catch (IOException e) {
            System.out.println("No file was found!");
        }
    }

    public Student createStudent() {
        String id;
        boolean check = false;
        do {
            System.out.println("Enter id: ");
            id = scanner.nextLine();
            check = validation.validateID(id);
            if (!check) {
                System.out.println("Wrong input!");
            }
        } while (!check);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        String birthDay;
        do {
            System.out.println("Enter birthday: ");
            birthDay = scanner.nextLine();
            check = validation.validateBirthDay(birthDay);
            if (!check) {
                System.out.println("Wrong input!");
            }
        } while (!check);
        int gender;
        do {
            System.out.print("Enter gender: ");
            gender = scanner.nextInt();
            scanner.nextLine();
            check = validation.validateGender(Integer.toString(gender));
            if (!check) {
                System.out.println("Wrong input!");
            }
        } while (!check);
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        String email;
        do {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            check = validation.validateEmail(email);
            if (!check) {
                System.out.println("Wrong input!");
            }
        } while (!check);

        System.out.print("Enter score: ");
        double score = scanner.nextDouble();
        scanner.nextLine();
        return new Student(id, fullName, birthDay, gender, address, email, score);

    }

    public void addStudent() {
        Student student = createStudent();
        list.add(student);
    }

    public void display() {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public void displaySearchList() {
        if (searchingList == null) {
            System.out.println("No student was found!");
        } else {
            for (Student student : searchingList) {
                System.out.println(student);
            }
        }
    }

    public List<Student> searchStudentById() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        searchingList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                searchingList.add(list.get(i));
                return searchingList;
            }
        }
        return searchingList;
    }

    public List<Student> searchStudentByName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        searchingList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFullName().contains(name)) {
                searchingList.add(list.get(i));
            }
        }
        return searchingList;
    }

    public List<Student> searchStudentByAgeRange() {
        System.out.print("Enter lower age: ");
        int lowerAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter higher age: ");
        int higherAge = scanner.nextInt();
        scanner.nextLine();
        searchingList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String year = list.get(i).getBirthDay().substring(6);
            int age = 2021 - Integer.parseInt(year);
            if (age >= lowerAge && age <= higherAge) {
                searchingList.add(list.get(i));
            }
        }
        return searchingList;
    }

    public List<Student> searchStudentByScoreRange() {
        System.out.print("Enter lower score: ");
        double lowerScore = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter higher score: ");
        double higherScore = scanner.nextDouble();
        scanner.nextLine();
        searchingList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            double score = list.get(i).getScore();
            if ((score >= lowerScore) && (score <= higherScore)) {
                searchingList.add(list.get(i));
            }
        }
        return searchingList;
    }

    public void confirmDeleteStudent() {
        System.out.print("Confirm? (Y/N): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            list.removeAll(searchingList);
            System.out.println("Deleting successful!");
        } else {
            System.out.println("Deleting failed!");
        }
    }

    public void deleteStudentById() {
        searchingList = searchStudentById();
        if (searchingList == null) {
            System.out.println("No student was found!");
        } else {
            System.out.println("Do you want to delete this student?");
            confirmDeleteStudent();
        }
    }

    public int checkInputType(int choice) {
        while (choice == -1) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("Wrong type, re enter: ");
            }
        }
        return choice;
    }

    public void sort() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if ((o1.getScore() > o2.getScore()) || (o1.getScore() < o2.getScore())) {
                    return (int) (o1.getScore() - o2.getScore());
                } else {
                    return o1.getFullName().compareTo(o2.getFullName());
                }
            }
        });
    }

    public void editName(Student student) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (!name.equals("")) {
            student.setFullName(name);
        }
        try {
            ReadAndWrite.writeFile("new.csv", list);
        } catch (IOException e) {
            System.out.println("Khong tim thay file hoac file loi");
        }
    }

    public void editBirthday(Student student) {
        System.out.print("Enter birthday: ");
        String birthDay = scanner.nextLine();
        if (age > 0 && age <= 100) {
            student.setAge(age);
        }
        writeFile("customermanagement.csv");
    }

    public void editGender(Customer customer) {
        int gender;
        do {
            System.out.print("Enter gender (1.Male/2.Female): ");
            int value = -1;
            gender = checkInputType(value);
            if (gender == 1 || gender == 2) {
                customer.setGender(gender);
            } else {
                System.out.print("Wrong input, re input (1.Male/2.Female): ");
            }
        } while (gender != 1 && gender != 2);
        writeFile("customermanagement.csv");
    }

    public void editAddress(Customer customer) {
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        if (!address.equals("")) {
            customer.setAddress(address);
        }
        writeFile("customermanagement.csv");
    }

    public void editJob(Customer customer) {
        System.out.print("Enter job: ");
        String job = scanner.nextLine();
        if (!job.equals("")) {
            customer.setJob(job);
        }
        writeFile("customermanagement.csv");
    }

    public void editPhone(Customer customer) {
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        if (!phone.equals("")) {
            if (phone.length() < 10) {
                System.err.print("Number phone too short, re input (10 numbers): ");
            } else if (phone.length() > 10) {
                System.err.print("Number phone too long, re input (10 numbers): ");
            } else {
                customer.setPhone(phone);
            }
        }
        writeFile("customermanagement.csv");
    }

    public void editInformation(Customer customer) {
        editName(customer);
        editAge(customer);
        editGender(customer);
        editAddress(customer);
        editJob(customer);
        editPhone(customer);
        writeFile("customermanagement.csv");
    }
