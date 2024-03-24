package services.impl;

import DTO.BankDTO;
import mappers.Mapper;
import mappers.impl.BankMapperImpl;
import models.Bank;
import repository.BankRepository;
import repository.impl.BankRepImpl;
import services.repository.BankServicesRepository;

import java.util.ArrayList;
import java.util.List;
public class BankServicesImpl implements BankServicesRepository {
    private Mapper bankMapper = new BankMapperImpl() ;
    BankRepository bankRepository = new BankRepImpl();
    public List<BankDTO> getListBankDTO(){
        List<BankDTO> resList = new ArrayList<>();
       List<Bank> banks = bankRepository.getBankList();
        for (Bank b: banks) {
            resList.add((BankDTO) bankMapper.fromModelToDTO(b));
        }
        return resList;
    }
}
