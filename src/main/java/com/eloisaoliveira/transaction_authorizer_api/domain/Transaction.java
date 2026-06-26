package com.eloisaoliveira.transaction_authorizer_api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Currency;
import java.util.UUID;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private UUID id;
    private TransactionType type;
    private BigDecimal amount;
    private Currency currency;
    private TransactionStatus status;
    private OffsetDateTime transactionDateTime;

    public Transaction() {
    }

    public Transaction(
        UUID id,
        TransactionType type,
        BigDecimal amount,
        Currency currency,
        TransactionStatus status,
        OffsetDateTime transactionDateTime
    ) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.transactionDateTime = transactionDateTime;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public OffsetDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(OffsetDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
