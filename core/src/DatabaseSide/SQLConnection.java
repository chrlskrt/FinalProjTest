package DatabaseSide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static String DBName = "";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static Connection getConnection (){
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL + DBName, USERNAME, PASSWORD);
            System.out.println("DB Connection success");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error in connecting to the database.");
            e.printStackTrace();
        }

        return connection;
    }
}
