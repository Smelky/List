package com.smelk;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList<T> implements FieldsForList<T> {

    private List list = new LinkedList();

    @Override
    public T get(int index) {

        return (T) list;
    }
    @Override
    public void add(T word) {
        list.add(word);
    }
    @Override
    public void remove(int index) {
        list.remove(index);
    }
    @Override
    public int size() {
        list.size();
        return list.size();
    }
}
