package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈客户信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 19:38
 * @since 1.0.0
 */
public class ServiceCustomerInfoDTO implements Serializable {
    private static final long serialVersionUID = 2812327328249614166L;

    private String customerPin;
    private String customerName;
    private String customerContactName;
    private String customerTel;
    private String customerMobilePhone;
    private String customerEmail;
    private String customerPostcode;

    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContactName() {
        return customerContactName;
    }

    public void setCustomerContactName(String customerContactName) {
        this.customerContactName = customerContactName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getCustomerMobilePhone() {
        return customerMobilePhone;
    }

    public void setCustomerMobilePhone(String customerMobilePhone) {
        this.customerMobilePhone = customerMobilePhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPostcode() {
        return customerPostcode;
    }

    public void setCustomerPostcode(String customerPostcode) {
        this.customerPostcode = customerPostcode;
    }
}
