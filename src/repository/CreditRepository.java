package repository;

import models.Credit;

import java.util.List;

public interface CreditRepository {
    List <Credit> getCreditList();
    List <Credit> getBestCreditList();


}
