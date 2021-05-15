package person;

public class Officier extends Staff {
    private String job;

    public Officier(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public Officier() {
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Officier {" + super.toString() +
                ", job: " + job + '\'' +
                "} ";
    }
}
