package com.tms.patterns.memento;

public class Cat {
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //Создание снимка
    public Memento save(){
        return new Memento(name, age);
    }

    //Восстановление снимка
    public void restore(Memento memento){
        this.age = memento.getAge();
        this.name = memento.getName();
    }
}
