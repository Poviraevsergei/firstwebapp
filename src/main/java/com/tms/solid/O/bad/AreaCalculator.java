package com.tms.solid.O.bad;

public class AreaCalculator {
    public double calculateArea(String shape, int... parameters) {
        switch (shape) {
            case "circle" -> {
                return Math.PI * Math.pow(parameters[0], 2);
            }
            case "rectangle" -> {
                return parameters[0] * parameters[1];
            }
            default -> {
                throw new IllegalArgumentException("Shape " + shape + " not supported");
            }
        }
    }

}
