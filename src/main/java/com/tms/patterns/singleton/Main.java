package com.tms.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationService service = ConfigurationService.getInstance();
        System.out.println(service.getProperty("url"));
        System.out.println(service.getProperty("login"));
        System.out.println(service.getProperty("password"));
    }
}
