package de.cofinpro.hackaton.registration.api;

import java.math.BigDecimal;

public class DepotRequest {

    private BigDecimal amount;
    private Integer risk;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }
}
