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

import java.util.Scanner;

public class MainMenu {
    public static void getMenu() {
       // BankRepository bankRepository = new BankRepImpl();
        BankServicesImpl bankServicesImpl = new BankServicesImpl();
        CreditServicesImpl creditServicesImpl = new CreditServicesImpl();
        CreditRepository creditRepository = new CreditRepImpl();
        DepositsRepository depositsRepository = new DepositsRepImpl();
        Mapper mapperBank = new BankMapperImpl();
        Mapper mapperCredit = new CreditMapperImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Получить список банков - 1, получить список кредитов - 2, получить список депозитов - 3");
        int listBankCredit = sc.nextInt();
        switch (listBankCredit){
            case 1 :
                System.out.println(bankServicesImpl.getListBankDTO());
                break;

            case 2 :
                System.out.println(creditServicesImpl.getListCreditDTO());
                break;

            case 3 :
                System.out.println(depositsRepository.getListDeposits());
                break;
        }

    }
}
