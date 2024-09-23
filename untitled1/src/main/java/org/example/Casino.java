package org.example;

public interface Casino {
    void depositMoneyToClient(int clientId, double amountOfMoney);

    void withdrawMoneyFromClient(int clientId, double amountOfMoney);

    void betMoneyFromClient(int clientId, double amountOfMoney);
}
