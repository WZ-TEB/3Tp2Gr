package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ClientsImplementation clientsImplementation = new ClientsImplementation();
        LocalDate date = LocalDate.of(1996, 7, 23);
        clientsImplementation.addNewClient("Wiktor", "Zareba", date);
        System.out.println(clientsImplementation.clientArrayList.get(0).getClientId());
        clientsImplementation.addNewClient("Wiktor", "Zareba", date);
        System.out.println(clientsImplementation.clientArrayList.get(1).getClientId());
    }
}