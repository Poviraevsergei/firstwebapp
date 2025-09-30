package com.tms.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    public List<Memento> mementoList = new ArrayList<>();

    public boolean addMemento(Memento memento) {
        return mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
