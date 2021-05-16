public class School {
    private Student[] students = new Student[100];
    int size = 0;

    public School() {
    }

    public void add(Student student) {
        students[size] = student;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void display20YearsOldStudent() {
        for (int i = 0; i < size; i++) {
            if (students[i].getAge() == 20) {
                System.out.println(students[i]);
            }
        }
    }

    public int count23YearsOldAtDN(){
        int count = 0;
        for (int i = 0; i<size;i++){
            if (students[i].getAge() == 23 && students[i].getHomeTown().equals("DN")){
                count ++;
            }
        }
        return count;
    }
}
