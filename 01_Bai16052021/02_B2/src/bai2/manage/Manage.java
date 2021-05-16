package bai2.manage;

public interface Manage<Object> {
    void add(Object object);
    void delete(int id);
    void searchByBook();
    void searchByMagazine();
    void searchByNewspaper();
    int find(int id);
    void display();
}
