package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈客户发货信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 19:41
 * @since 1.0.0
 */
public class ServiceExpressInfoDTO implements Serializable {
    private static final long serialVersionUID = -4407686037859664320L;

    private int afsServiceId;
    private String freightMoney;
    private String expressCompany;
    private String deliverDate;
    private String expressCode;

    public int getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsServiceId(int afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public String getFreightMoney() {
        return freightMoney;
    }

    public void setFreightMoney(String freightMoney) {
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
