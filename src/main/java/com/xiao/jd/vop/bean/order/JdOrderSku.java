package com.xiao.jd.vop.bean.order;

import java.io.Serializable;

/**
 * 〈京东订单商品详情〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 12:12
 * @since 1.0.0
 */
public class JdOrderSku implements Serializable {
    private static final long serialVersionUID = 1823076387920138699L;

    private long skuId;
    private String name;
    private int num;
    private int type;
    private int category;
    private double price;
    private double nakedPrice;
    private double taxPrice;
    private int oid;
    private int tax;

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNakedPrice() {
        return nakedPrice;
    }

    public void setNakedPrice(double nakedPrice) {
        this.nakedPrice = nakedPrice;
    }

    public double getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(double taxPrice) {
        this.taxPrice = taxPrice;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}

