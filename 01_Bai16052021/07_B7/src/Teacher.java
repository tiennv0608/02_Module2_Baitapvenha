public class Teacher extends Person {
    private int salary;
    private int bonus;
    private int fine;

    public Teacher(String name, int age, String address, String id) {
        super(name, age, address, id);
    }

    public Teacher(String name, int age, String address, String id, int salary, int bonus, int fine) {
        super(name, age, address, id);
        this.salary = salary;
        this.bonus = bonus;
        this.fine = fine;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Teacher {" + super.toString() +
                "salary: " + salary +
                ", bonus: " + bonus +
                ", fine: " + fine +
                "} ";
    }
}
