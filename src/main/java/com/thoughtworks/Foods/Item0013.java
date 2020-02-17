package com.thoughtworks.Foods;

public class Item0013 implements Food {
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
    public String getId() {
        return "ITEM0013";
    }

    @Override
    public String getName() {
        return "肉夹馍";
    }

    @Override
    public double getPrice() {
        return 6.00;
    }

    @Override
    public int getCount() {
        return count;
    }
}
