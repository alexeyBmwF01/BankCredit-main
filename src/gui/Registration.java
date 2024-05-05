package gui;


import models.Client;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public void beginRegistration() {
        //File file = new File("src/resources/Connection.properties");
        boolean isItCorrectData = false;
        Scanner sc = new Scanner(System.in);
        String name, lastName, email;
        while (!isItCorrectData) {
            Client client = new Client();
            System.out.println("введите имя");
            do {
                name = sc.nextLine();
                if (isBadString(name) || !isValidName(name))
                    System.out.println("не верно введено имя");
            }
            while (isBadString(name) || !isValidName(name));

            client.setNameClient(name);

            System.out.println("введите фамилию");
            do {
                lastName = sc.nextLine();
                if (isBadString(lastName) || !isValidLastName(lastName))
                    System.out.println("не верно введена фамилия");
            }
            while (isBadString(lastName) || !isValidLastName(lastName));

            client.setLastName(lastName);


            System.out.println("введите электонную почту");
            do {
                email = sc.nextLine();
                if (isBadString(email) || !isValidemail(email))
                    System.out.println("не верно введена электронная почта");
            }
            while (isBadString(email) || !isValidemail(email));

            client.setEmail(email);

            if (client.isEmpty()) {
                System.out.println("не верно введены данные клиента");
            }
            isItCorrectData = true;
        }


    }


    private boolean isBadString(String s) {
        if (s.trim().isEmpty())
            return true;
        return false;
    }

    private boolean isValidName(String s) {
        Pattern pattern = Pattern.compile("\\w{2,}", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    private boolean isValidLastName(String s) {
        Pattern pattern = Pattern.compile("\\w{2,}", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    private boolean isValidemail(String s) {
        Pattern pattern = Pattern.compile("\\w{3,}@\\w+.\\w{1,3}", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();

    }


}
