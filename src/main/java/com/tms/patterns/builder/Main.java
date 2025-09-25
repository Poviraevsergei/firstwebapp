package com.tms.patterns.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder().setName("Alex").setWeight(100).setAge(10).build();
        User diman = new User.Builder().setName("Diman").build();

        LombokUser lombokUser = LombokUser.builder().name("Alex").salary(2000).build();
        System.out.println(lombokUser);
    }
}
