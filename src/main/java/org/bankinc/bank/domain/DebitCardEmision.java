package org.bankinc.bank.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;

@Builder
@AllArgsConstructor
@Getter
@ToString
public class DebitCardEmision {
    private BigInteger cardId;
    private boolean activationCard;
    private BigDecimal balance;
}
