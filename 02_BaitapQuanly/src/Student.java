public class Student {
    private String id;
    private String fullName;
    private String birthDay;
    private int gender;
    private String address;
    private String email;
    private double score;

    public Student(String id, String fullName, String birthDay, int gender, String address, String email, double score) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.score = score;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        String year = getBirthDay().substring(6);
        int age = 2021 - Integer.parseInt(year);
        String sex = "";
        if (getGender() == 1) {
            sex = "Nam";
        } else if (getGender() == 2) {
            sex = "Nu";
        }
        return "Student{" +
                "id: '" + id + '\'' +
                ", fullName: '" + fullName + '\'' +
                ", age: " + age +
                ", gender: " + sex + '\'' +
                ", address: '" + address + '\'' +
                ", email: '" + email + '\'' +
                ", score: " + score +
                '}';
    }
}
