public abstract class Employee {
    private String id;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private int employeeType;
    public static int employeeCount = 0;

    public Employee(String id, String fullName, String birthDay, String phone, String email, int employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        employeeCount++;
    }

    public Employee() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                ", fullName: '" + fullName + '\'' +
                ", birthDay: '" + birthDay + '\'' +
                ", phone: '" + phone + '\'' +
                ", email: '" + email + '\'' +
                ", employeeType: " + employeeType;
    }
}
