package com.tms.patterns.builder;

public class User {
    private String name;
    private int age;
    private int salary;
    private int weight;
    private int height;

    public static class Builder {
        private final User user;

        public Builder() {
            user = new User();
        }

        public Builder setName(String name) {
            user.name = name;
            return this;
        }

        public Builder setAge(int age) {
            user.age = age;
            return this;
        }

        public Builder setSalary(int salary) {
            user.salary = salary;
            return this;
        }

        public Builder setWeight(int weight) {
            user.weight = weight;
            return this;
        }

        public Builder setHeight(int height) {
            user.height = height;
            return this;
        }

        public User build() {
            return user;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
