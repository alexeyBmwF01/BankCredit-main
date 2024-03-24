package mappers.impl;

import DTO.CreditDTO;
import mappers.Mapper;
import models.Credit;

public class CreditMapperImpl implements Mapper<Credit, CreditDTO> {
    @Override
    public CreditDTO fromModelToDTO(Credit model) {
        CreditDTO creditDTO = new CreditDTO();
        creditDTO.setId(model.getId());
        creditDTO.setCreditsBid(model.getCreditsBid());
        creditDTO.setNameCredit(model.getNameCredit());
        return creditDTO;
    }

    @Override
    public Credit fromDTOtoModel(CreditDTO dto) {
        Credit credit = new Credit();
        credit.setNameCredit(dto.getNameCredit());
        credit.setCreditsBid(dto.getCreditsBid());
        return credit;
    }
}
