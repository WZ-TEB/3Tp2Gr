package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ClientsImplementationTest {

    LocalDate testDate = LocalDate.of(1996, 7, 23);

    @Test
    void addNewClient() {
        //given
        ClientsImplementation testClientsImplementation = new ClientsImplementation();
        //when
        testClientsImplementation.addNewClient("testClientFirstName", "testClientLastName", testDate);
        //then
        assertEquals(1, testClientsImplementation.getNumberOfClients());
    }

    @Test
    void getClientBirthdate() {
        //given
        ClientsImplementation testClientsImplementation = new ClientsImplementation();
        testClientsImplementation.addNewClient("testClientFirstName", "testClientLastName", testDate);
        Client testClient = testClientsImplementation.clientArrayList.get(0);
        //when
        LocalDate testClientBirthDate = testClient.getBirthDate();
        //then
        assertEquals(testDate, testClientBirthDate);
    }

    @Test
    void getClientFullName() {
        //given
        ClientsImplementation testClientsImplementation = new ClientsImplementation();
        testClientsImplementation.addNewClient("testClientFirstName", "testClientLastName", testDate);
        //when
        String testClientFullName = testClientsImplementation.getClientFullName(0);
        //then
        assertEquals(testClientFullName, "testClientFirstName testClientLastName");
    }

    @Test
    void activatePremiumAccount() {
        //given
        ClientsImplementation testClientsImplementation = new ClientsImplementation();
        testClientsImplementation.addNewClient("testClientFirstName", "testClientLastName", testDate);
        Client testClient = testClientsImplementation.clientArrayList.get(0);
        //when
        testClient.setPremiumStatus(true);
        //then
        assertTrue(testClient.isPremiumStatus());
    }
}
