package db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import exceptions.PropertyFileException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;


    static {
        String inputFile = "src/resources/Connection.properties";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("login")) {
                    config.setUsername(line.substring(line.indexOf("=") + 1));
                } else if (line.contains("pass")) {
                    config.setPassword(line.substring(line.indexOf("=") + 1));
                } else if (line.contains("url")) {
                    config.setJdbcUrl(line.substring(line.indexOf("=") + 1));
                } else {
                    throw new PropertyFileException("incorrectPropertyFile");
                }
            }

        } catch (IOException | PropertyFileException e) {
            e.printStackTrace();
        }
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(config);
    }

    private DataSource() throws FileNotFoundException {
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}