package DatabaseSide;

import com.mygdx.game.PlayerNeeds.Player;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static DatabaseManager instance;
    private final Player currentUser = Player.getInstance();
    public static DatabaseManager getInstance(){
        if (instance == null){
            instance = new DatabaseManager();
        }

        return instance;
    }


    private DatabaseManager(){};

    public static void initDB(){
        Statement stmt;
        try (Connection conn = SQLConnection.getConnection()){
            stmt = conn.createStatement();

            String createDBQuery = "CREATE DATABASE IF NOT EXISTS dbDodgeBallGame;";
            stmt.execute(createDBQuery);

            SQLConnection.DBName = "dbDodgeBallGame";
            conn.setCatalog("dbDodgeBallGame");
            conn.setAutoCommit(false);

            stmt = conn.createStatement();

            String createTblPlayersQuery = "CREATE TABLE IF NOT EXISTS users (" +
                    "user_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR (50) NOT NULL," +
                    "password VARCHAR (50) NOT NULL)";
            stmt.execute(createTblPlayersQuery);

            conn.commit();
            System.out.println("Database is connected successfully.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
