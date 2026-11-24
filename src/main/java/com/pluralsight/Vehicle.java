package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(BigDecimal originalCost, String dateAcquired, String description, String makeModel, int year, int odometer) {
        super(originalCost, dateAcquired, description);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getAge() {
       int age = LocalDate.now().getYear() - year;
        return age;
    }

    public BigDecimal getValue() {
        int age = getAge();
        BigDecimal value;

        if (age > 10) {
            value = new BigDecimal("1000.00");
        } else {
            double ratePerYear;
            if (age <= 3) {
                ratePerYear = 0.03;
            } else if (age <= 6) {
                ratePerYear = 0.06;
            } else {
                ratePerYear = 0.08;
            }
            BigDecimal multiplier = BigDecimal.valueOf(1 - (ratePerYear * age));
            value = getOriginalCost().multiply(multiplier);
        }

        String lower = makeModel.toLowerCase();
        boolean isHondaOrToyota = lower.contains("honda") || lower.contains("toyota");

        if (odometer > 100000 && !isHondaOrToyota) {
            value = value.multiply(new BigDecimal("0.75"));
        }

        return value.setScale(2, RoundingMode.HALF_UP);
    }

}
