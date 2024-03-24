import gui.MainMenu;
import gui.Registration;
import models.Credit;
import repository.BankRepository;
import repository.CreditRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.beginRegistration();
        MainMenu.getMenu();

    }
}
