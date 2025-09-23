package com.tms.solid.O.good;

public class Circle implements ShapeArea {

    @Override
    public double calculateArea(int... parameters) {
        return Math.PI * Math.pow(parameters[0], 2);
    }
}
