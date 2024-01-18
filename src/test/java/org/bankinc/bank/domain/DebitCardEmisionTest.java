package org.bankinc.bank.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

class DebitCardEmisionTest {


    //TODO: generate randoms digits
    @Test
    void create_debit_Card_Object() {
        DebitCardEmision debitCard = DebitCardEmision.builder()
                .cardId(new BigInteger("1020301234567801"))
                .activationCard(Boolean.FALSE)
                .balance(new BigDecimal(23124))
                .build();
        assertThat(debitCard).isNotNull();
    }

}