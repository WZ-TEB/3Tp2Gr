package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClientsImplementation implements Clients {
    ArrayList<Client> clientArrayList = new ArrayList<>();
    @Override
    public void addNewClient(String firstName, String lastName, LocalDate birthDate) {
        Client client = new Client(firstName, lastName, birthDate);
        clientArrayList.add(client);
        client.setClientId(clientArrayList.indexOf(client));
        System.out.println("Client added to list");
    }

    @Override
    public int getNumberOfClients() {
        return clientArrayList.size();
    }

    @Override
    public boolean isClientPremium(int clientId) {
        Client client = clientArrayList.get(clientId);
        return client.isPremiumStatus();
    }

    @Override
    public LocalDate getClientBirthdate(int clientId) {
        Client client = clientArrayList.get(clientId);
        return client.getBirthDate();
    }

    @Override
    public String getClientFullName(int clientId) {
        Client client = clientArrayList.get(clientId);
        return client.getFirstName() + " " + client.getLastName();
    }

    @Override
    public String activatePremiumAccount(int clientId) {
        Client client = clientArrayList.get(clientId);
        client.setPremiumStatus(true);
        return "Client status set to Premium";
    }


}
