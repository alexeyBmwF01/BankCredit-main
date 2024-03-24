package repository;

import com.mysql.cj.xdevapi.Client;
import models.Bank;

import java.util.List;

public interface BankRepository {
    List <Bank> getBankList();



}
