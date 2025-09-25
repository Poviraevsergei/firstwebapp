package com.tms.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Pineapple pineapple = new Pineapple("Green", 10);
        Pineapple pineappleCloned = (Pineapple) pineapple.clone();

        System.out.println(pineappleCloned.getColor());
        System.out.println(pineappleCloned.getSize());
    }
}
