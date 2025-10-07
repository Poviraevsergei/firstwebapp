package com.tms.database;

import java.time.LocalDateTime;

public class User {
    private int id;
    private String username;
    private String userPassword;
    private LocalDateTime created;
    private LocalDateTime changed;
    private int age;
    private String role;

    public User() {}

    public User(int id, String username, String userPassword, LocalDateTime created, LocalDateTime changed, int age, String role) {
        this.id = id;
        this.username = username;
        this.userPassword = userPassword;
        this.created = created;
        this.changed = changed;
        this.age = age;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getChanged() {
        return changed;
    }

    public void setChanged(LocalDateTime changed) {
        this.changed = changed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", created=" + created +
                ", changed=" + changed +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
