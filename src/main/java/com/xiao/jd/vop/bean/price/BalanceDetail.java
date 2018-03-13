package com.xiao.jd.vop.bean.price;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈余额明细〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 13:04
 * @since 1.0.0
 */
public class BalanceDetail implements Serializable {
    private static final long serialVersionUID = -2814242034667941030L;
    /**
     * 余额明细 ID
     */
    private long id;
    /**
     * 账户类型 1：可用余额 2：锁定余额
     */
    private int accountType;
    /**
     * 金额（元），有正负，可以是零，表示订单流程变化，如退款时会先有一条退款申请的记录，金额为 0
     */
    private double amount;
    /**
     * 京东 Pin
     */
    private String pin;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 业务类型
     */
    private int tradeType;
    /**
     * 业务类型名称
     */
    private String tradeTypeName;
    /**
     * 余额变动日期
     */
    private Date createdDate;
    /**
     * 备注信息
     */
    private String notePub;
    /**
     * 业务号，一般由余额系统，在每一次操作成功后自动生成，也可以由前端业务系统传入
     */
    private long tradeNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getTradeType() {
        return tradeType;
    }

    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeTypeName() {
        return tradeTypeName;
    }

    public void setTradeTypeName(String tradeTypeName) {
        this.tradeTypeName = tradeTypeName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getNotePub() {
        return notePub;
    }

    public void setNotePub(String notePub) {
        this.notePub = notePub;
    }

    public long getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(long tradeNo) {
        this.tradeNo = tradeNo;
    }
}
