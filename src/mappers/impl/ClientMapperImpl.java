package mappers.impl;

import DTO.ClientDTO;
import mappers.Mapper;
import models.Client;

public class ClientMapperImpl implements Mapper<Client, ClientDTO> {

    @Override
    public ClientDTO fromModelToDTO(Client model) {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setEmail(model.getEmail());
        clientDTO.setNameClient(model.getNameClient());
        clientDTO.setLastName(model.getLastName());
        clientDTO.setIdClient(model.getIdClient());
        return clientDTO;
    }

    @Override
    public Client fromDTOtoModel(ClientDTO dto) {
        Client client = new Client();
        client.setNameClient(client.getLastName());
        client.setLastName(client.getLastName());
        client.setEmail(client.getEmail());
        client.setPass(client.getPass());
        client.setLogin(client.getLogin());
        return client;
    }
}
