package com.pluralsight;


import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        House myHouse = new House( new BigDecimal("189500.00"), "2019-03-02", "Single-story ranch, needs minor repairs", "118 Oak Avenue, Jersey City, NJ 07305", 2, 1200, 3200);
        House house2 = new House(new BigDecimal("325000.00"), "2021-06-15", "Two-story colonial with updated kitchen", "42 Maple Street, Bayonne, NJ 07002", 4, 2150, 5000);
        Vehicle vehicle = new Vehicle( new BigDecimal("28500.00"), "2022-09-10", "Silver sedan, one previous owner", "Toyota Camry", 2020, 34500);
        Vehicle tonyTruck = new Vehicle(new BigDecimal("41200.00"), "2023-01-20", "Black pickup truck, towing package", "Ford F-150", 2021, 18200);

        assets.add(myHouse);
        assets.add(house2);
        assets.add(vehicle);
        assets.add(tonyTruck);

        for (int i = 0, assets.)


    }
}