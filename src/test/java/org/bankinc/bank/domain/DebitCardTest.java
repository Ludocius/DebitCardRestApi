package org.bankinc.bank.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DebitCardTest {

    @Test
    void create_debit_Card_Object() {
        DebitCard debitCard = DebitCard.builder()
                .cardId(new BigInteger("1020301234567801"))
                .balance(new BigDecimal("312000"))
                .ownerName("Alfonso vega")
                .expireDate(LocalDate.now())
                .build();
        assertThat(debitCard).isNotNull();
    }
}