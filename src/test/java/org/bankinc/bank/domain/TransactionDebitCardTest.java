package org.bankinc.bank.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TransactionDebitCardTest {

    @Test
    void create_debit_Card_Object() {
        TransactionDebitCard transactionDebitCard = TransactionDebitCard.builder()
                .transactionId(3000l)
                .price(BigDecimal.valueOf(2002))
                .transactionDate(LocalDate.now())
                .isDebitCardActie(Boolean.TRUE)
                .isDebitCardBlocked(Boolean.FALSE)
                .build();
        assertThat(transactionDebitCard).isNotNull();
    }

}