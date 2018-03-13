package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈客户发运信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 16:21
 * @since 1.0.0
 */
public class AfsCustomerDeliverDetailDto implements Serializable {
    private static final long serialVersionUID = -1420292266369342334L;

    private int afsServiceId;
    private double freightMoney;
    private String expressCompany;
    private String deliverDate;
    private String expressCode;

    public int getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsServiceId(int afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public double getFreightMoney() {
        return freightMoney;
    }

    public void setFreightMoney(double freightMoney) {
        this.freightMoney = freightMoney;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }
}
