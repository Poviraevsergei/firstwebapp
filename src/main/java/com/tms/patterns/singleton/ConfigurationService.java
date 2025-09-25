package com.tms.patterns.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationService {
    private static ConfigurationService instance;
    private final Properties properties;

    private ConfigurationService() {
        properties = new Properties();
        loadConfiguration();
    }

    public static ConfigurationService getInstance() {
        if (instance == null) {
            instance = new ConfigurationService();
        }
        return instance;
    }

    private void loadConfiguration() {
        try (FileInputStream fis = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(fis);
        } catch (IOException | NullPointerException e) {
            System.out.println("Error loading configuration file: " + e.getMessage());
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
