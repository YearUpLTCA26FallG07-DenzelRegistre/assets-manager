package com.pluralsight;

import java.math.BigDecimal;
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

    public BigDecimal getValue(int initialCost, int yearHad, int mileage, String makeModel){
        String lowerMakeModel = makeModel.toLowerCase();
        BigDecimal finalCost = null;
        if (yearHad <= 3){
             finalCost = initialCost * Math.pow(1 - 0.03);
            if (mileage > 100000 && !lowerMakeModel.contains("honda") && !lowerMakeModel.contains("toyaota")){
                finalCost *= 0.75;
            }
            System.out.println(finalCost);
        } else if (yearHad > 3 && yearHad <= 6 ){
             finalCost = initialCost * Math.pow(1 - 0.06);
            if (mileage > 100000 && !lowerMakeModel.contains("honda") && !lowerMakeModel.contains("toyaota")){
                finalCost *= 0.75;
            }
            System.out.println(finalCost);
        } else if (yearHad > 6 && yearHad <= 10 ){
             finalCost = initialCost * Math.pow(1 - 0.08);
            if (mileage > 100000 && !lowerMakeModel.contains("honda") && !lowerMakeModel.contains("toyaota")){
                finalCost *= 0.75;
            }
            System.out.println(finalCost);
        } else if (yearHad > 10){
             finalCost = BigDecimal.valueOf(1000.00);
            if (mileage > 100000 && !lowerMakeModel.contains("honda") && !lowerMakeModel.contains("toyaota")){
                finalCost *= 0.75;
                System.out.println(finalCost);
            }

        }


        return finalCost ;

    }
}
