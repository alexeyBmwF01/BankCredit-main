package repository.impl;

import models.Bank;
import repository.BankRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankRepImpl implements BankRepository {
//    File file = new File("src/resources/Connection.txt");
//    Scanner sc;
//    {
//        try {
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
String url = "jdbc:mysql://localhost:3306/mysql";
    String login = "root";
    String pass = "2125930Bmw";

    @Override
    public List<Bank> getBankList() {
        List<Bank> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, login, pass)) {
            Statement statement = connection.createStatement();
            statement.execute("use mydb");
            PreparedStatement pr = connection.prepareStatement("select idBank, BankName from bank");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                list.add(new Bank(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
