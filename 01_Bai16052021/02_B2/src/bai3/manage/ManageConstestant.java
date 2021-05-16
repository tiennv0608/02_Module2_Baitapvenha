package bai3.manage;

import bai3.constestant.Constestant;

public class ManageConstestant implements Manage<Constestant> {
    private Constestant[] list = new Constestant[100];
    private int size = 0;

    @Override
    public void add(Constestant object) {
        list[size] = object;
        size++;
    }

    @Override
    public int find(String id) {
        for (int i = 0; i < size; i++) {
            if (list[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i<size;i++) {
            System.out.println(list[i]);
        }
    }
}
