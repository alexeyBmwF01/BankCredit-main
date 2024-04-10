package repository.impl;

import models.Bank;
import models.Deposits;
import repository.DepositsRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepositsRepImpl implements DepositsRepository {
    String url = "jdbc:mysql://localhost:3306/mysql";
    String login = "root";
    String pass = "2125930Bmw";

    @Override
    public List<Deposits> getListDeposits() {
        List<Deposits> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, login, pass)) {
            Statement statement = connection.createStatement();
            statement.execute("use mydb");
            PreparedStatement pr = connection.prepareStatement("select * from deposits");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                list.add(new Deposits(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Deposits> getListBestDeposits() {
        List<Deposits> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, login, pass)) {
            Statement statement = connection.createStatement();
            statement.execute("use mydb");
            PreparedStatement pr = connection.prepareStatement("select * from deposits order by  depositsBid desc limit 3");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                list.add(new Deposits(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
            return list;
        }
    }
