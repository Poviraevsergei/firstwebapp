package com.tms.solid.O.good;

public class Square implements ShapeArea {
    @Override
    public double calculateArea(int... parameters) {
        return parameters[0] * 4;
    }
}
