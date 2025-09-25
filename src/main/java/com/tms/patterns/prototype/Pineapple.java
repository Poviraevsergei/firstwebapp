package com.tms.patterns.prototype;

public class Pineapple implements Prototype {
    private String color;
    private int size;

    public Pineapple(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Prototype clone() {
        return new Pineapple(color, size);
    }
}
