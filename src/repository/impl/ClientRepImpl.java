package repository.impl;

import repository.ClientRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientRepImpl implements ClientRepository {
    File file = new File("src/resources/Connection.properties");
    Scanner sc;

    {
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

