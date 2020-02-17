package com.thoughtworks.Sale;

import com.thoughtworks.Foods.Food;

import java.util.ArrayList;

public interface Sale {
    /**
     * 返回打折结果，并格式为清单标准格式
     *
     * @return 标准格式的打折信息
     */
    public abstract String saleInfo();

    /**
     * 计算当前打折方式的价格
     *
     * @param selectedFoodList 选择的菜品
     */
    public abstract void calculateCost(ArrayList<Food> selectedFoodList);

    /**
     * 返回当前打折方式最终价格
     *
     * @return 最终价格
     */
    public abstract double getCost();
}
