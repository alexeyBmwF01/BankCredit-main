package mappers.impl;

import DTO.BankDTO;
import mappers.Mapper;
import models.Bank;

public class BankMapperImpl implements Mapper<Bank,BankDTO> {
    @Override
    public BankDTO fromModelToDTO(Bank model) {
        BankDTO bankDTO = new BankDTO();
        bankDTO.setNameBank(model.getNameBank());
        bankDTO.setCredits(model.getCredits());
        return bankDTO;
    }

    @Override
    public Bank fromDTOtoModel(BankDTO dto) {
        Bank bank = new Bank();
        bank.setCredits(dto.getCredits());
        return bank;
    }
}
