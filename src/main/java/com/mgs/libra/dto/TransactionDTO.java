package com.mgs.libra.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransactionDTO {

    Details details;
    LocalDate postingDate;
    String description;
    Double amount;
    String type;
    // IF null, the transaction is pending
    Double balance;

    enum Details {
        CREDIT,
        DEBIT
    }

}
