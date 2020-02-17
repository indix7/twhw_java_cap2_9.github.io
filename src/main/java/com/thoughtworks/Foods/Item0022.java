package com.thoughtworks.Foods;

public class Item0022 implements Food {
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
    public int getCount() {
        return count;
    }

    @Override
    public String getId() {
        return "ITEM0022";
    }

    @Override
    public String getName() {
        return "凉皮";
    }

    @Override
    public double getPrice() {
        return 8.00;
    }
}
