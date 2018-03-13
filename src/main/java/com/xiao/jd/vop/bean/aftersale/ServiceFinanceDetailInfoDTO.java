package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈退款明细〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 19:43
 * @since 1.0.0
 */
public class ServiceFinanceDetailInfoDTO implements Serializable {
    private static final long serialVersionUID = -153412041360407063L;

    private int refundWay;
    private String refundWayName;
    private int status;
    private String statusName;
    private double refundPrice;
    private String wareName;
    private int wareId;

    public int getRefundWay() {
        return refundWay;
    }

    public void setRefundWay(int refundWay) {
        this.refundWay = refundWay;
    }

    public String getRefundWayName() {
        return refundWayName;
    }

    public void setRefundWayName(String refundWayName) {
        this.refundWayName = refundWayName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public double getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(double refundPrice) {
        this.refundPrice = refundPrice;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public int getWareId() {
        return wareId;
    }

    public void setWareId(int wareId) {
        this.wareId = wareId;
    }
}
