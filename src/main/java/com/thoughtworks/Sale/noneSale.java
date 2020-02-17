package com.thoughtworks.Sale;

import com.thoughtworks.Foods.Food;

import java.util.ArrayList;

public class noneSale implements Sale {
    private double cost = 0.0;

    @Override
    public String saleInfo() {
        return "";
    }

    @Override
    public void calculateCost(ArrayList<Food> selectedFoodList) {
        for (Food selectedFood : selectedFoodList) {
            this.cost += selectedFood.originTotal();
        }
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
