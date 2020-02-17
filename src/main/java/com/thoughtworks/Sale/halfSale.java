package com.thoughtworks.Sale;

import com.thoughtworks.Foods.Food;

import java.util.ArrayList;

public class halfSale implements Sale {
    private double cost = 0.0;
    private double discount = 0.0;
    private String discountFoodNames = "";

    @Override
    public String saleInfo() {
        String saleInfo = "-----------------------------------\n使用优惠:\n指定菜品半价("
                + this.discountFoodNames.substring(0, this.discountFoodNames.length() - 1) + ")，省"
                + (int) this.discount + "元\n";
        return saleInfo;
    }

    @Override
    public void calculateCost(ArrayList<Food> selectedFoodList) {
        for (Food selectedFood : selectedFoodList) {
            if (selectedFood.specialSale()) {
                this.cost += selectedFood.originTotal() / 2;
                this.discount += selectedFood.originTotal() / 2;
                this.discountFoodNames += selectedFood.getName() + "，";
            } else {
                this.cost += selectedFood.originTotal();
            }
        }
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
