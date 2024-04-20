package services.impl;

import DTO.CreditDTO;
import mappers.Mapper;
import mappers.impl.CreditMapperImpl;
import models.Credit;
import repository.CreditRepository;
import repository.impl.CreditRepImpl;
import services.repository.CreditServicesRepository;

import java.util.ArrayList;
import java.util.List;

public class CreditServicesImpl implements CreditServicesRepository {
    CreditRepository creditRepository = new CreditRepImpl();
    Mapper mapperCredit = new CreditMapperImpl();

    @Override
    public List<CreditDTO> getListCreditDTO() {
        List<CreditDTO> resList = new ArrayList<>();
        List<Credit> credits = creditRepository.getCreditList();
        for (Credit c : credits) {
            resList.add((CreditDTO) mapperCredit.fromModelToDTO(c));
        }
        return resList;
    }

    @Override
    public List<CreditDTO> getBestListCreditDTO() {
        List<CreditDTO> resList = new ArrayList<>();
        List<Credit> credits = creditRepository.getBestCreditList();
        long start = System.currentTimeMillis();
        for (Credit c : credits) {
            resList.add((CreditDTO) mapperCredit.fromModelToDTO(c));
        }
        long end = System.currentTimeMillis();
        System.out.println("время исполенния getBestListCreditDTO " + (end - start));

        return resList;
    }
}
