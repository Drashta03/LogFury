package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LogViewer {

    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/event_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        // View logs
        viewLogs();
    }

    public static void viewLogs() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM events ORDER BY timestamp DESC";
            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    LocalDateTime timestamp = rs.getObject("timestamp", LocalDateTime.class);
                    String description = rs.getString("event_description");
                    System.out.printf("ID: %d | Timestamp: %s | Description: %s%n", id, timestamp, description);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
