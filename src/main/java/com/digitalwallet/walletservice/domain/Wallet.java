package com.digitalwallet.walletservice.domain;

import java.math.BigDecimal;

public class Wallet {

    private int walletId;
    private Customer customer;
    private BigDecimal balance;
    private WalletCurrency currency;

    public Wallet(int walletId, Customer customer, BigDecimal balance, String currency) {
        this.walletId = walletId;
        this.customer = customer;
        this.balance = balance;
        this.currency = new WalletCurrency(currency);
    }

}
