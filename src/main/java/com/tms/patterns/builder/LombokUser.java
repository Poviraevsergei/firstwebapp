package com.tms.patterns.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LombokUser {
    private String name;
    private int age;
    private int salary;
    private int weight;
    private int height;
    private boolean gender;
}
