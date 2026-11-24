package com.codeguard.testdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dataset2_HardcodedPassword {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/shop";

    public boolean login(String userId, String input) {
        String password = "admin1234";
        return userId != null && password.equals(input);
    }

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, "root", "root1234");
    }
}
