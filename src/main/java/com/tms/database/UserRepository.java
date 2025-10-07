package com.tms.database;

import org.postgresql.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class UserRepository {
    private static final String CONFIG_FILE_PATH = "app.properties";

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(CONFIG_FILE_PATH));

        //1. Регистрация драйвера
        Class.forName("org.postgresql.Driver");

        //2. Создание соединения
        Connection connection = DriverManager.getConnection(
                props.getProperty("db_url"),
                props.getProperty("db_login"),
                props.getProperty("db_password"));

        //3. Создание Statement
    }


}
