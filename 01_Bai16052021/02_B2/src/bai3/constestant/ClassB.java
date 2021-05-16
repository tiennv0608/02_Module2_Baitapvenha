package bai3.constestant;

public class ClassB extends Constestant {
    public static final String MATH = "Toan";
    public static final String CHEMISTRY = "Hoa";
    public static final String BIOLOGY = "Sinh";

    public ClassB() {
    }

    public ClassB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Subject: " + MATH +
                ", " + CHEMISTRY + ", " + BIOLOGY;
    }
}
