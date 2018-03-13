package com.xiao.jd.vop.bean.customer;

import java.io.Serializable;

/**
 * 〈取件信息实体〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 15:38
 * @since 1.0.0
 */
public class CustomerPickware implements Serializable {
    private static final long serialVersionUID = 4523435331825185560L;

    /**
     * 取件方式必填
     * 4 上门取件
     * 7 客户送货
     * 40 客户发货
     */
    private int pickwareType;

    private int pickwareProvince;
    private int pickwareCity;
    private int pickwareCounty;
    private int pickwareVillage;
    private String pickwareAddress;

    public int getPickwareType() {
        return pickwareType;
    }

    public void setPickwareType(int pickwareType) {
        this.pickwareType = pickwareType;
    }

    public int getPickwareProvince() {
        return pickwareProvince;
    }

    public void setPickwareProvince(int pickwareProvince) {
        this.pickwareProvince = pickwareProvince;
    }

    public int getPickwareCity() {
        return pickwareCity;
    }

    public void setPickwareCity(int pickwareCity) {
        this.pickwareCity = pickwareCity;
    }

    public int getPickwareCounty() {
        return pickwareCounty;
    }

    public void setPickwareCounty(int pickwareCounty) {
        this.pickwareCounty = pickwareCounty;
    }

    public int getPickwareVillage() {
        return pickwareVillage;
    }

    public void setPickwareVillage(int pickwareVillage) {
        this.pickwareVillage = pickwareVillage;
    }

    public String getPickwareAddress() {
        return pickwareAddress;
    }

    public void setPickwareAddress(String pickwareAddress) {
        this.pickwareAddress = pickwareAddress;
    }
}
