package org.bankinc.bank.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@Getter
@ToString
public class TransactionDebitCard {
    private Long transactionId;
    private BigDecimal price;
    private LocalDate transactionDate;
    private boolean isDebitCardActie;
    private boolean isDebitCardBlocked;
}
