package com.tms.database;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionMain {
    public static void main(String[] args) throws SQLException {
        User user1 = new User(0,"Transaction3","qwerty",null,null,20,"USER");
        User user2 = new User(0,"Transaction4","qwerty",null,null,20,"USER");

        Connection connection = null;
        try {
            connection = UserRepository.createConnection();
            connection.setAutoCommit(false);

            UserRepository.addUser(user1,connection);
            UserRepository.addUser(user2,connection);
            connection.commit();
        } catch (SQLException | ClassNotFoundException e) {
            if (connection != null) {
                connection.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
