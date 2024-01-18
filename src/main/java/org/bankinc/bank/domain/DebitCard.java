package org.bankinc.bank.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@Getter
@ToString
public class DebitCard {
    private BigInteger cardId;
    private String ownerName;
    private LocalDate expireDate;
    private BigDecimal balance;


}
