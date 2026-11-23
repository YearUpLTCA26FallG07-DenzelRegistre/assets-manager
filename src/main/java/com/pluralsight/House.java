package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(BigDecimal originalCost, String dateAcquired, String description, String address, int condition, int squareFoot, int lotSize) {
        super(originalCost, dateAcquired, description);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public BigDecimal getValue(int condition, int squareFoot, int lotSize){
        BigDecimal total = null;
        if (condition == 1){
           total = BigDecimal.valueOf(( 180.00 * squareFoot) + ( .25 * lotSize));
            System.out.println(total);
        } else if (condition == 2) {
             total = BigDecimal.valueOf(( 130.00 * squareFoot) + ( .25 * lotSize));
            System.out.println(total);
        } else if (condition == 3) {
             total = BigDecimal.valueOf(( 90.00 * squareFoot) + ( .25 * lotSize));
            System.out.println(total);
        } else if (condition == 4) {
             total = BigDecimal.valueOf(( 80.00 * squareFoot) + ( .25 * lotSize));
            System.out.println(total);
        }

        return total;
    }
}