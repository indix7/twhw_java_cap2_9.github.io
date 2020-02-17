package com.thoughtworks.Foods;

public class Item0030 implements Food {
    private int count = 0;

    @Override
    public boolean specialSale() {
        return false;
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
    public int getCount() {
        return count;
    }

    @Override
    public String getId() {
        return "ITEM0030";
    }

    @Override
    public String getName() {
        return "冰粉";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}
