package gui;


import models.Client;

import java.io.File;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public void beginRegistration() {
        //File file = new File("src/resources/Connection.txt");
        boolean isItCorrectData = false;
        Scanner sc = new Scanner(System.in);
        String name, lastName, email;
        System.out.println("введите имя");
        while (!isItCorrectData) {
            name = sc.nextLine();
            Client client = new Client();
            if (isBadString(name) || (!isValidName(name))) {
                System.out.println("не верно введено имя");
                continue;
            }
            client.setNameClient(name);
            System.out.println("введите фамилию");
            lastName = sc.nextLine();
            if (isBadString(lastName) || !isValidLastName(lastName)) {
                System.out.println("не верно введена фамилия");
                continue;
            }
            client.setLastName(lastName);
            System.out.println("введите электонную почту");
            email = sc.nextLine();
            if (isBadString(email) || (!isValidemail(email))) {
                System.out.println("не верно введена электронная почта");
                continue;
            } else {
                client.setEmail(email);
                if (client.isEmpty()) {
                    System.out.println("не верно введены данные клиента");
                }
            }
            isItCorrectData = true;
        }
//        try (Connection connection = DriverManager.getConnection(String.valueOf(url))) {
//            Statement statement = connection.createStatement();
//            statement.execute("use mydb");
//            PreparedStatement pr = connection.prepareStatement("insert client(idClient, nameClient)" +
//                    " values( ? , ?");
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
     }

    private boolean isBadString(String s) {
        if (s.trim().isEmpty())
            return true;
        return false;
    }

    private boolean isValidName(String s) {
        Pattern pattern = Pattern.compile("\\w{3,}", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    private boolean isValidLastName(String s) {
        Pattern pattern = Pattern.compile("\\w{5,}", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    private boolean isValidemail(String s) {
        Pattern pattern = Pattern.compile("\\w{3,}@\\w+.\\w{2,5}",Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();

    }


}
