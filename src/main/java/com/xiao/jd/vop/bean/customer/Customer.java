package com.xiao.jd.vop.bean.customer;

import java.io.Serializable;

/**
 * 〈客户信息实体〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 15:29
 * @since 1.0.0
 */
public class Customer implements Serializable {
    private static final long serialVersionUID = -5620106270700567082L;

    /**
     * 联系人，能获取到就必填
     */
    private String customerContactName;
    /**
     * 联系电话，能获取到就必填
     */
    private String customerTel;
    /**
     * 手机号
     */
    private String customerMobilePhone;
    /**
     * Email
     */
    private String customerEmail;
    /**
     * 邮编
     */
    private String customerPostcode;

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
