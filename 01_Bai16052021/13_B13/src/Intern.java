public class Intern extends Employee {
    private String majors;
    private int semester;
    private String universityName;

    public Intern(String id, String fullName, String birthDay, String phone, String email, int employeeType, String majors, int semester, String universityName) {
        super(id, fullName, birthDay, phone, email, 2);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern() {
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" + super.toString() +
                ", majors: '" + majors + '\'' +
                ", semester: " + semester +
                ", universityName: '" + universityName + '\'' +
                "} ";
    }
}
