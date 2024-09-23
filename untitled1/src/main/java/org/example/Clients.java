package org.example;

import java.time.LocalDate;

public interface Clients  {
    void addNewClient(String firstName, String lastName, LocalDate birthDate);
    int getNumberOfClients();
    boolean isClientPremium(int clientId);
    LocalDate getClientBirthdate(int clientId);
    String getClientFullName(int clientId);
    String activatePremiumAccount(int clientId);
}
