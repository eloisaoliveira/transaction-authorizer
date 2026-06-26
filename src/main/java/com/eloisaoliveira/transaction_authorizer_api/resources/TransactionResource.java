package com.eloisaoliveira.transaction_authorizer_api.resources;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eloisaoliveira.transaction_authorizer_api.domain.Transaction;
import com.eloisaoliveira.transaction_authorizer_api.domain.TransactionStatus;
import com.eloisaoliveira.transaction_authorizer_api.domain.TransactionType;

@RestController
@RequestMapping(value="transactions")
public class TransactionResource {

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<Transaction>> findAll() {
        Transaction trans1 = new Transaction(
            UUID.fromString("123e4567-e89b-12d3-a456-426614174000"),
            TransactionType.CREDIT, 
            new BigDecimal("150.50"),      
            Currency.getInstance("BRL"),   
            TransactionStatus.SUCCEEDED, 
            OffsetDateTime.now());
        List<Transaction> list = new ArrayList<>();
        list.addAll(Arrays.asList(trans1));
        return ResponseEntity.ok().body(list);
    }
}
