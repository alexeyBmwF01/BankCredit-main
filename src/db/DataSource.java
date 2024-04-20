package db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;


    static {
//        try {
//            Class.forName("com.mysql.jdbс.Driver");
//        } catch (ClassNotFoundException e){
//            throw new RuntimeException("driver error");
//        }
        config.setDriverClassName("com.mysql.jdbс.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mysql");
        config.setUsername("root");
        config.setPassword("2125930Bmw");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(config);
    }

    private DataSource() {
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}