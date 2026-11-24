package com.pluralsight;

import java.math.BigDecimal;

public abstract class Asset {

    protected String description;
    protected String dateAcquired;
    protected BigDecimal originalCost;

    public Asset(BigDecimal originalCost, String dateAcquired, String description) {
        this.originalCost = originalCost;
        this.dateAcquired = dateAcquired;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public BigDecimal getValue(){
        return originalCost;
    }

}
