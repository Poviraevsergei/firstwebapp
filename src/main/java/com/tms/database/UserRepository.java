package com.tms.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final String INSERT_USER_SQL = "INSERT INTO users(id, username, user_password, created, changed, age, role) VALUES (DEFAULT, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_USERS_SQL = "SELECT * FROM users";
    private static final String REMOVE_USERS_SQL = "CALL remove_users_by_username(?)";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = createConnection();

        removeUserByUsername("Transaction3", connection);
        connection.close();
    }

    public static int addUser(User user, Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(INSERT_USER_SQL);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getUserPassword());
        statement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
        statement.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
        statement.setInt(5, user.getAge());
        statement.setString(6, user.getRole());

        return statement.executeUpdate();
    }

    public static Connection createConnection() throws SQLException, ClassNotFoundException {
        //1. Регистрация драйвера
        Class.forName("org.postgresql.Driver");

        //2. Создание соединения
        return DriverManager.getConnection(
                System.getProperty("db_url"),
                System.getProperty("db_login"),
                System.getProperty("db_password"));
    }

    public static void removeUserByUsername(String username, Connection connection) throws SQLException {
        CallableStatement callableStatement = connection.prepareCall(REMOVE_USERS_SQL);
        callableStatement.setString(1, username);
        callableStatement.execute();
    }

    public static List<User> parseResultSetToUserList(ResultSet resultSet) throws SQLException {
        List<User> userList = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setUserPassword(resultSet.getString("user_password"));
            user.setCreated(resultSet.getTimestamp("created").toLocalDateTime());
            user.setChanged(resultSet.getTimestamp("changed").toLocalDateTime());
            user.setAge(resultSet.getInt("age"));
            user.setRole(resultSet.getString("role"));
            userList.add(user);
        }
        return userList;
    }
}
