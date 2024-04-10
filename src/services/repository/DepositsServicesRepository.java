package services.repository;

import DTO.DepositsDTO;

import java.util.List;

public interface DepositsServicesRepository {
    List<DepositsDTO> getListDepositsDTO();
    List<DepositsDTO> getBestListDepositsDTO();
}
