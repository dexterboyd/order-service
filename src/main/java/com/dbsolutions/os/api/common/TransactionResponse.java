package com.dbsolutions.os.api.common;

import com.dbsolutions.os.api.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

    private Orders orders;
    private double amount;
    private String transactionId;
    private String message;
}
