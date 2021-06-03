import java.io.IOException;
import java.time.Year;
import java.util.*;

public class StudentManagement {
    List<Student> list;
    List<Student> searchingList = null;
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();

    public StudentManagement() {
        list = new ArrayList<>();
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public boolean checkID(String id) {
        for (Student student : list) {
            if (student.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public Student createStudent() {
        System.out.print("Enter id: ");
        String id;
        boolean check = false;
        do {
            id = validateData(validation.ID_REGEX);
            check = checkID(id);
            if (!check) {
                System.out.print("Dupicated ID, re input:");
            }
        } while (!check);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter birthday: ");
        String birthDay = validateData(validation.DATE_OF_BIRTH_REGEX);
        System.out.print("Enter gender (1.Nam/2.Nu): ");
        int gender = Integer.parseInt(validateData(validation.GENDER_REGEX));
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = validateData(validation.EMAIL_REGEX);
        System.out.print("Enter score: ");
        double score = -1.0;
        while (score == -1) {
            try {
                score = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Wrong type, re input:");
            } finally {
                scanner.nextLine();
            }
        }
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
        int value = -1;
        int lowerAge = checkInputType(value);
        System.out.print("Enter higher age: ");
        int higherAge = checkInputType(value);
        searchingList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String year = list.get(i).getBirthDay().substring(6);
            int age = Integer.parseInt(String.valueOf(Year.now())) - Integer.parseInt(year);
            if (age >= lowerAge && age <= higherAge) {
                searchingList.add(list.get(i));
            }
        }
        return searchingList;
    }

    public List<Student> searchStudentByScoreRange() {
        System.out.print("Enter lower score: ");
        double lowerScore = -1.0;
        while (lowerScore == -1) {
            try {
                lowerScore = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Wrong type, re input:");
            } finally {
                scanner.nextLine();
            }
        }
        System.out.print("Enter higher score: ");
        double higherScore = -1.0;
        while (higherScore == -1) {
            try {
                higherScore = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Wrong type, re input:");
            } finally {
                scanner.nextLine();
            }
        }
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
        if (searchingList.size() == 0) {
            System.out.println("No student was found!");
        } else {
            System.out.print("Do you want to delete this student? (Press Y to confirm): ");
            confirmDeleteStudent();
        }
    }

    public int checkInputType(int choice) {
        while (choice == -1) {
            try {
                choice = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Wrong type, re enter: ");
            } finally {
                scanner.nextLine();
            }
        }
        return choice;
    }

    public void sort() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) {
                    return 1;
                } else if (o1.getScore() < o2.getScore()) {
                    return -1;
                } else {
                    return o1.getFullName().compareTo(o2.getFullName());
                }
            }
        });
    }

    public String validateData(String regex) {
        String string;
        boolean check = false;
        do {
            string = scanner.nextLine();
            check = validation.validate(regex, string);
            if (!check) {
                System.out.print("Wrong input, re input: ");
            }
        } while (!check);
        return string;
    }

    public void editName(Student student) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (!name.equals("")) {
            student.setFullName(name);
            System.out.println("Update successful!");
        } else {
            System.out.println("Update failed!");
        }
    }

    public void editBirthDay(Student student) {
        System.out.print("Enter birthday: ");
        String birthDay = validateData(validation.DATE_OF_BIRTH_REGEX);
        student.setBirthDay(birthDay);
        System.out.println("Update successful!");
    }

    public void editGender(Student student) {
        System.out.print("Enter gender (1.Male/2.Female): ");
        int gender = Integer.parseInt(validateData(validation.GENDER_REGEX));
        student.setGender(gender);
        System.out.println("Update successful!");
    }

    public void editAddress(Student student) {
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        if (!address.equals("")) {
            student.setAddress(address);
            System.out.println("Update successful!");
        } else {
            System.out.println("Update failed!");
        }
    }

    public void editEmail(Student student) {
        System.out.print("Enter email: ");
        String email = validateData(validation.EMAIL_REGEX);
        student.setEmail(email);
        System.out.println("Update successful!");
    }

    public void editScore(Student student) {
        System.out.print("Enter score: ");
        Double score = -1.0;
        while (score == -1) {
            try {
                score = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Wrong type, re input:");
            } finally {
                scanner.nextLine();
            }
        }
        student.setScore(score);
        System.out.println("Update successful!");
    }

    public void editInformation(Student student) {
        editName(student);
        editBirthDay(student);
        editGender(student);
        editAddress(student);
        editEmail(student);
        editScore(student);
    }

    public void writeToFile() {
        ReadAndWrite.writeToFile("new.csv", list);
        System.out.println("Write complete!");
    }

    public List<Student> readFromFile() throws IOException {
        list = ReadAndWrite.readFromFile("student.csv");
        return list;
    }
}
