import java.time.LocalTime;

public abstract class Vehicle {
    private String name;
    private int fee;
    private LocalTime timeIn;
    private LocalTime timeOut;

    public Vehicle(){
    }

    public Vehicle(String name, LocalTime timeIn) {
        this.name = name;
        this.timeIn = timeIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return fee;
    }

    public void setCost(int fee) {
        this.fee = fee;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
    }
}
