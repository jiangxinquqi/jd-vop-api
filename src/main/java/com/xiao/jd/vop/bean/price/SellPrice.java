package com.xiao.jd.vop.bean.price;

import java.io.Serializable;

/**
 * 〈京东售卖价〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 18:32
 * @since 1.0.0
 */
public class SellPrice implements Serializable {
    private static final long serialVersionUID = 603101708719582397L;

    /**
     * 商品 ID
     */
    private long skuId;
    /**
     * 商品京东价格
     */
    private double jdPrice;
    /**
     * 客户购买价格
     */
    private double price;

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public double getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(double jdPrice) {
        this.jdPrice = jdPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
