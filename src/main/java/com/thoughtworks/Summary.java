package com.thoughtworks;

import com.thoughtworks.Foods.Food;
import com.thoughtworks.Sale.Sale;
import com.thoughtworks.Sale.halfSale;
import com.thoughtworks.Sale.noneSale;
import com.thoughtworks.Sale.reduce6Sale;

import java.util.ArrayList;

public class Summary {
    private ArrayList<Food> selectedFoodList = new ArrayList<>();

    public Summary(ArrayList<Food> selectedFoodList) {
        this.selectedFoodList = selectedFoodList;
    }


    /**
     * 返回最终的输出结果
     *
     * @return 最终打印清单
     */
    public String getSummaryInfo() {
        String summaryInfo = "============= 订餐明细 =============\n";
        summaryInfo += getFoodDetail();
        summaryInfo += chooseSale().saleInfo();
        summaryInfo += "-----------------------------------\n总计：" + (int) chooseSale().getCost() + "元\n"
                + "===================================";
        return summaryInfo;
    }

    /**
     * 返回最终清单中菜品的选择及个数这一部分信息
     *
     * @return 选择的菜品信息
     */
    public String getFoodDetail() {
        String foodSummary = "";
        for (Food selectedFood : selectedFoodList) {
            foodSummary += formatFoodDetail(selectedFood) + "\n";
        }
        return foodSummary;
    }

    public String formatFoodDetail(Food food) {
        return food.getName() + " x " + food.getCount() + " = " + (int) food.originTotal() + "元";
    }

    /**
     * 选择对应打折方式
     *
     * @return 最小价格方式
     */
    public Sale chooseSale() {
        ArrayList<Sale> sales = new ArrayList<Sale>() {{
            add(new noneSale());
            add(new reduce6Sale());
            add(new halfSale());
        }};
        Sale minCostSale = sales.get(0);
        minCostSale.calculateCost(this.selectedFoodList);
        for (int index = 1; index < sales.size(); index++) {
            Sale sale = sales.get(index);
            sale.calculateCost(this.selectedFoodList);
            if (sale.getCost() < minCostSale.getCost()) {
                minCostSale = sale;
            }
        }
        return minCostSale;
    }

}
