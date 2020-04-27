package by.bsuir.renTrip.repository.impl;

import by.bsuir.renTrip.entity.Client;
import by.bsuir.renTrip.repository.specification.client.*;
import by.bsuir.renTrip.repository.specification.client.ClientDeleteByIdSpecification;
import by.bsuir.renTrip.repository.specification.client.ClientSelectByUserIdSpecification;
import by.bsuir.renTrip.repository.specification.client.ClientUpdateStatusAndTimeByIdSpecification;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClientRepositoryTest {
    int clientId = 44;

    @Test
    public void getInstance() {
        assertNotNull(ClientRepository.getInstance());
    }

    @Test
    public void selectAllTest() {
        List<Client> clients = ClientRepository.getInstance().query(new ClientSelectAllSpecification());
        assertFalse(clients.isEmpty());
    }

    @Test
    public void updateClientTest() {
        ClientRepository.getInstance().update(new ClientUpdateIncrStatusSpecification(clientId));
        List<Client> clients = ClientRepository.getInstance().query(new ClientSelectAllSpecification());
        Client foundClient = clients.stream()
                .filter(o -> clientId == o.getId())
                .findFirst()
                .orElse(null);
        assertNotNull(foundClient);
    }

    @Test
    public void findByUserIdTest() {
        int userId = 1;
        List<Client> clients = ClientRepository.getInstance().query(new ClientSelectByIdWhereCanRentMoreSpecification(userId));
        assertFalse(clients.isEmpty());
    }

    @Test
    public void decrClientTest() {
        ClientRepository.getInstance().update(new ClientUpdateDecrStatusSpecification(clientId));
        List<Client> clients = ClientRepository.getInstance().query(new ClientSelectAllSpecification());
        Client foundClient = clients.stream()
                .filter(o -> clientId == o.getId())
                .findFirst()
                .orElse(null);
        assertNull(foundClient);
    }
}
