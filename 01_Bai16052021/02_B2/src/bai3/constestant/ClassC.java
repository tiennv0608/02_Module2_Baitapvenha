package bai3.constestant;

public class ClassC extends Constestant {
    public static final String LITERATURE = "Van";
    public static final String HISTORY = "Su";
    public static final String GEOGRAPHY = "Dia";

    public ClassC() {
    }

    public ClassC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Subject: " + LITERATURE +
                ", " + HISTORY + ", " + GEOGRAPHY;
    }
}
