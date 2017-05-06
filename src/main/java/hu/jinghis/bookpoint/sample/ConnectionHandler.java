package hu.jinghis.bookpoint.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {
    public static Connection getConnection() throws SQLException {
        return
                DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                        "postgres", "asd");
    }
}
