package services.impl;

import DTO.CreditDTO;
import DTO.DepositsDTO;
import mappers.Mapper;
import mappers.impl.CreditMapperImpl;
import mappers.impl.DepositsMapperImpl;
import models.Credit;
import models.Deposits;
import repository.DepositsRepository;
import repository.impl.DepositsRepImpl;
import services.repository.DepositsServicesRepository;

import java.util.ArrayList;
import java.util.List;

public class DepositsServicesImpl implements DepositsServicesRepository {
    DepositsRepository depositsRepository = new DepositsRepImpl();
    Mapper mapperDeposits = new DepositsMapperImpl();

    @Override
    public List<DepositsDTO> getListDepositsDTO() {
        List<DepositsDTO> resList = new ArrayList<>();
        List<Deposits> deposits = depositsRepository.getListDeposits();
        for (Deposits c: deposits) {
            resList.add((DepositsDTO) mapperDeposits.fromModelToDTO(c));
        }

        return resList;
    }

    @Override
    public List<DepositsDTO> getBestListDepositsDTO() {
        List<DepositsDTO> resList = new ArrayList<>();
        List<Deposits> deposits = depositsRepository.getListBestDeposits();
        for (Deposits c: deposits) {
            resList.add((DepositsDTO) mapperDeposits.fromModelToDTO(c));
        }

        return resList;


    }
}
