package com.thoughtworks.Sale;

import com.thoughtworks.Foods.Food;

import java.util.ArrayList;

public class reduce6Sale implements Sale {
    private double cost = 0.0;

    @Override
    public String saleInfo() {
        return "-----------------------------------\n" +
                "使用优惠:\n" +
                "满30减6元，省6元\n";
    }

    @Override
    public void calculateCost(ArrayList<Food> selectedFoodList) {
        for (Food selectedFood : selectedFoodList) {
            this.cost += selectedFood.originTotal();
        }
    }

    @Override
    public double getCost() {
        if (this.cost >= 30) {
            return this.cost - 6;
        }
        return this.cost;
    }
}
