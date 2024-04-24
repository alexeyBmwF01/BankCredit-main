package repository.impl;

import db.DataSource;
import models.Bank;
import models.Credit;
import repository.CreditRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreditRepImpl implements CreditRepository {
//    File file = new File("src/resources/Connection.txt");
//    Scanner sc;
//    {
//        try {
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//String url = "jdbc:mysql://localhost:3306/mysql";
//    String login = "root";
//    String pass = "2125930Bmw";


    @Override
    public List<Credit> getCreditList() {
        List<Credit> list = new ArrayList<>();
        try (Connection connection = DataSource.getConnection()) {
            Statement statement = connection.createStatement();
            statement.execute("use mydb");
            PreparedStatement pr = connection.prepareStatement("select * from credits");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                list.add(new Credit(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Credit> getBestCreditList() {
        List<Credit> list = new ArrayList<>();
        try (Connection connection = DataSource.getConnection()) {
            Statement statement = connection.createStatement();
            statement.execute("use mydb");
            PreparedStatement pr = connection.prepareStatement("select * from credits order by  CreditsBid asc limit 3");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                list.add(new Credit(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
