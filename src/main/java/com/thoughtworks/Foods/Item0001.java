package com.thoughtworks.Foods;

public class Item0001 implements Food {
    private int count = 0;

    @Override
    public boolean specialSale() {
        return true;
    }

    @Override
    public double originTotal() {
        return this.getPrice() * this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getId() {
        return "ITEM0001";
    }

    @Override
    public String getName() {
        return "黄焖鸡";
    }

    @Override
    public double getPrice() {
        return 18.00;
    }

    @Override
    public int getCount() {
        return count;
    }
}
