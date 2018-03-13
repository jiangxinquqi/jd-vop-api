package com.xiao.jd.vop.bean.product;

import java.io.Serializable;

/**
 * 〈商品可售状态〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 15:32
 * @since 1.0.0
 */
public class SellState implements Serializable {

    private static final long serialVersionUID = -2792783698432130397L;

    /**
     * 商品编号
     */
    private long skuId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 是否可售，1：是，0：否
     */
    private int saleState;
    /**
     * 是否可开增票，1：支持，0：不支持
     */
    private int isCanVAT;
    /**
     * 是否支持 7 天无理由退货，1：是，0：否
     */
    private int is7ToReturn;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public int getSaleState() {
        return saleState;
    }

    public void setSaleState(int saleState) {
        this.saleState = saleState;
    }

    public int getIsCanVAT() {
        return isCanVAT;
    }

    public void setIsCanVAT(int isCanVAT) {
        this.isCanVAT = isCanVAT;
    }

    public int getIs7ToReturn() {
        return is7ToReturn;
    }

    public void setIs7ToReturn(int is7ToReturn) {
        this.is7ToReturn = is7ToReturn;
    }
}
