package manage;

import person.Staff;

public class ManageStaff implements Manage<Staff> {
    private Staff[] list = new Staff[100];
    private int size = 0;

    @Override
    public void add(Staff object) {
        list[size] = object;
        size++;
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < size; i++) {
            if (list[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}
