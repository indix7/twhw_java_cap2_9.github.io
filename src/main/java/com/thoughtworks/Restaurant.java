package com.thoughtworks;

public class Restaurant {

    public String bestCharge(String selectedItems) {
        Menu menu = new Menu();
        menu.chooseDish(selectedItems);
        Summary summary = new Summary(menu.getSelectedFoodList());
        return summary.getSummaryInfo();
    }
}
