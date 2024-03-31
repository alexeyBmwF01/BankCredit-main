package mappers.impl;

import DTO.DepositsDTO;
import mappers.Mapper;
import models.Deposits;

public class DepositsMapperImpl implements Mapper<Deposits, DepositsDTO> {

    @Override
    public DepositsDTO fromModelToDTO(Deposits model) {
        DepositsDTO depositsDTO = new DepositsDTO();
        depositsDTO.setId(model.getId());
        depositsDTO.setDepositsName(model.getDepositsName());
        depositsDTO.setDepositsBid(model.getDepositsBid());
        return depositsDTO;
    }

    @Override
    public Deposits fromDTOtoModel(DepositsDTO dto) {
        Deposits deposits = new Deposits();
        deposits.setDepositsName(dto.getDepositsName());
        deposits.setDepositsBid(dto.getDepositsBid());
        return deposits;
    }
}
