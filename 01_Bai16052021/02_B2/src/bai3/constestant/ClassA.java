package bai3.constestant;

public class ClassA extends Constestant {
    public static final String MATH = "Toan";
    public static final String PHYSICS = "Ly";
    public static final String CHEMISTRY = "Hoa";

    public ClassA() {
    }

    public ClassA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Subject: " + MATH +
                ", " + PHYSICS + ", " + CHEMISTRY;
    }
}
