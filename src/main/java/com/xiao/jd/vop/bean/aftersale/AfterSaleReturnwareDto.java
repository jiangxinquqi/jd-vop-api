package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 15:12
 * @since 1.0.0
 */
public class AfterSaleReturnwareDto implements Serializable {
    private static final long serialVersionUID = 8374031949870314529L;

    private int returnwareType;
    private int returnwareProvince;
    private int returnwareCity;
    private int returnwareCounty;
    private int returnwareVillage;
    private int returnwareAddress;

    public int getReturnwareType() {
        return returnwareType;
    }

    public void setReturnwareType(int returnwareType) {
        this.returnwareType = returnwareType;
    }

    public int getReturnwareProvince() {
        return returnwareProvince;
    }

    public void setReturnwareProvince(int returnwareProvince) {
        this.returnwareProvince = returnwareProvince;
    }

    public int getReturnwareCity() {
        return returnwareCity;
    }

    public void setReturnwareCity(int returnwareCity) {
        this.returnwareCity = returnwareCity;
    }

    public int getReturnwareCounty() {
        return returnwareCounty;
    }

    public void setReturnwareCounty(int returnwareCounty) {
        this.returnwareCounty = returnwareCounty;
    }

    public int getReturnwareVillage() {
        return returnwareVillage;
    }

    public void setReturnwareVillage(int returnwareVillage) {
        this.returnwareVillage = returnwareVillage;
    }

    public int getReturnwareAddress() {
        return returnwareAddress;
    }

    public void setReturnwareAddress(int returnwareAddress) {
        this.returnwareAddress = returnwareAddress;
    }
}
