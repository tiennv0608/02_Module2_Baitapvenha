package bai3.manage;

public interface Manage<Object> {
    void add(Object object);
    int find(String id);
    void display();
}
