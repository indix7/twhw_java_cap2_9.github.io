package com.thoughtworks.Foods;

import javax.xml.crypto.dom.DOMCryptoContext;

public interface Food {
    /**
     * 确定该商品是否为特殊打折商品
     *
     * @return 是否为特殊打折商品
     */
    public abstract boolean specialSale();

    /**
     * 返回该商品单价*个数的无任何折扣的总价格
     *
     * @return 原始总价
     */
    public abstract double originTotal();

    public abstract void setCount(int count);

    public abstract String getId();

    public abstract double getPrice();

    public abstract String getName();

    public abstract int getCount();
}
