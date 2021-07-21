package com.GS.shipperIntegration.Models;

public class ResponsibleParty {
//    private Address address;
//    private Contact contact;
    private AccountNumber accountNumber = new AccountNumber("740561073");

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }
}
