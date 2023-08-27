package com.digitalwallet.walletservice.domain;

import java.util.Arrays;
import java.util.List;

public class WalletCurrency {

    private final List<String> currencyList = Arrays.asList("USD", "PEN", "EUR");
    public String value;

    public WalletCurrency(String value) {
        this.value = value;

    }

    private void ensureIsValidCurrency() {
        if(!this.currencyList.contains(this.value)) {
            throw new RuntimeException();
        }
    }
}
