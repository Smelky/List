package com.smelk;

public interface FieldsForList<T> {

    T get(int i);
    void add(T t);
    void remove(int i);
    int size();
}

