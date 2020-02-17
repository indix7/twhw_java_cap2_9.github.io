package com.thoughtworks;

import com.thoughtworks.Foods.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private HashMap<String, Food> menuMap = new HashMap<String, Food>() {{
        put("ITEM0001", new Item0001());
        put("ITEM0013", new Item0013());
        put("ITEM0022", new Item0022());
        put("ITEM0030", new Item0030());
    }};
    private ArrayList<Food> selectedFoodList = new ArrayList<>();

    public Menu() {}

    /**
     * 解析传入的字符串，将其转换为对应菜品以及个数
     *
     * @param choose 传入的点菜信息
     */
    public void chooseDish(String choose) {
        String[] dish = choose.split(",");
        for (String item : dish) {
            String[] idAndCount = item.split(" x ");
            String id = idAndCount[0];
            int count = Integer.parseInt(idAndCount[1]);
            this.selectFood(id, count);
        }
    }

    /**
     * 保存选择的菜品的一个实例对象
     *
     * @param id    menuMap中对应对象的key
     * @param count 菜品个数
     */
    public void selectFood(String id, int count) {
        Food selectedFood = menuMap.get(id);
        selectedFood.setCount(count);
        this.selectedFoodList.add(selectedFood);
    }

    public ArrayList<Food> getSelectedFoodList() {
        return this.selectedFoodList;
    }
}
