package gui;

import mappers.Mapper;
import mappers.impl.BankMapperImpl;
import mappers.impl.CreditMapperImpl;
import repository.CreditRepository;
import repository.DepositsRepository;
import repository.impl.CreditRepImpl;
import repository.impl.DepositsRepImpl;
import services.impl.BankServicesImpl;
import services.impl.CreditServicesImpl;
import services.impl.DepositsServicesImpl;

import java.util.Scanner;

public class MainMenu {
    public static void getMenu() {
        // BankRepository bankRepository = new BankRepImpl();
        BankServicesImpl bankServicesImpl = new BankServicesImpl();
        CreditServicesImpl creditServicesImpl = new CreditServicesImpl();
        CreditRepository creditRepository = new CreditRepImpl();
        DepositsRepository depositsRepository = new DepositsRepImpl();
        DepositsServicesImpl depositsServicesImpl = new DepositsServicesImpl();
        Mapper mapperBank = new BankMapperImpl();
        Mapper mapperCredit = new CreditMapperImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Получить список банков - 1, получить список всех кредитов - 2, получить список выгодных кредитов - 3," +
                " получить список всех депозитов - 4, получить список выгодных депозитов - 5");
        int listBankCredit = sc.nextInt();
        switch (listBankCredit) {
            case 1:
                System.out.println(bankServicesImpl.getListBankDTO());
                break;

            case 2:
                System.out.println(creditServicesImpl.getListCreditDTO());
                break;

            case 3:
                System.out.println(creditServicesImpl.getBestListCreditDTO());
                break;

            case 4:
                System.out.println(depositsServicesImpl.getListDepositsDTO());
                break;

            case 5:
                System.out.println(depositsServicesImpl.getBestListDepositsDTO());
                break;

        }

    }
}
