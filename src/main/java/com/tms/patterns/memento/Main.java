package com.tms.patterns.memento;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1,"Boris");
        Caretaker caretaker = new Caretaker();

        caretaker.addMemento(cat.save()); //создаем первую версию объекта

        cat.setAge(2);
        cat.setName("Adam");

        caretaker.addMemento(cat.save()); //создаем вторую версию объекта

        cat.setAge(3);
        System.out.println("Сейчас: " + cat);

        //Восстановление
        cat.restore(caretaker.getMemento(0));
        System.out.println("Первая версия:" + cat);

        cat.restore(caretaker.getMemento(1));
        System.out.println("Вторая версия:" + cat);
    }
}
