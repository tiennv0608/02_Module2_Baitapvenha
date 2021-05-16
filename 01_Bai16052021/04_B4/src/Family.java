import java.util.Arrays;

public class Family {
    private int numberOfMember;
    private Person[] persons = new Person[numberOfMember];
    private int address;

    public Family(int numberOfMember, Person[] persons, int address) {
        this.numberOfMember = numberOfMember;
        this.persons = persons;
        this.address = address;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family {" +
                "persons: " + Arrays.toString(persons) +
                ", address:" + address +
                '}';
    }
}
