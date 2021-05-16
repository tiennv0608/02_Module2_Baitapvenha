public class Student {
    private String name;
    private int age;
    private String homeTown;
    private String className;

    public Student() {
    }

    public Student(String name, int age, String homeTown, String className) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", home town: '" + homeTown + '\'' +
                ", class name: '" + className + '\'' +
                '}';
    }
}
