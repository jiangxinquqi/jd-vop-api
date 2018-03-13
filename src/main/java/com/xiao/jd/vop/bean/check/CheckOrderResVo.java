package com.xiao.jd.vop.bean.check;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈订单信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 13:59
 * @since 1.0.0
 */
public class CheckOrderResVo implements Serializable {
    private static final long serialVersionUID = 3812202618845462802L;

    /**
     * 京东订单编号
     */
    private long jdOrderId;
    /**
     * 订单状态 0 是新建 1 是妥投 2 是拒收
     */
    private int state;
    /**
     * 是否挂起 0 为为挂起 1 为挂起
     */
    private int hangUpState;
    /**
     * 开票方式(1 为随货开票，0 为订单预借，2 为集中开票 )
     */
    private int invoiceState;
    /**
     * 订单金额
     */
    private double orderPrice;
    /**
     * 订单时间
     */
    private Date time;

    public long getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(long jdOrderId) {
        this.jdOrderId = jdOrderId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getHangUpState() {
        return hangUpState;
    }

    public void setHangUpState(int hangUpState) {
        this.hangUpState = hangUpState;
    }

    public int getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(int invoiceState) {
        this.invoiceState = invoiceState;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
