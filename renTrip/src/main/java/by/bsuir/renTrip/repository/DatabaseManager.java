package by.bsuir.renTrip.repository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseManager {
    private static DatabaseManager instance;
    private HikariDataSource dataSource;

    private DatabaseManager() {
        HikariConfig hikariConfig = new HikariConfig("/database.properties");
        dataSource = new HikariDataSource(hikariConfig);
    }

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public HikariDataSource getDataSource() {
        return dataSource;
    }
}
