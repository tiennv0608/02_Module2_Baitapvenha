package bai2.manage;

import bai2.document.Document;

public class ManageDocument implements Manage<Document> {
    private Document[] list = new Document[100];
    private int size = 0;


    @Override
    public void add(Document object) {
        list[size] = object;
        size++;
    }

    @Override
    public void delete(int id) {
        int index = find(id);
        for (int i = index; i<size;i++) {
            list[i] = list[i+1];
        }
        size --;
        display();
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < size; i++) {
            if (list[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i<size;i++){
            System.out.println(list[i]);
        }
    }
}
