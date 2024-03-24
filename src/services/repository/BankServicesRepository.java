package services.repository;

import DTO.BankDTO;

import java.util.List;

public interface BankServicesRepository {
    List<BankDTO> getListBankDTO();
}
