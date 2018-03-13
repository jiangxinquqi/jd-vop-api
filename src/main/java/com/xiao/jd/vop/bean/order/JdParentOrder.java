package com.xiao.jd.vop.bean.order;

import java.io.Serializable;
import java.util.List;

/**
 * 〈京东父订单详情〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 11:46
 * @since 1.0.0
 */
public class JdParentOrder implements Serializable {
    private static final long serialVersionUID = 8252749988557883099L;

    private long jdOrderId;
    private double orderTaxPrice;
    private double orderNakedPrice;
    private double orderPrice;
    private double freight;
    private List<JdOrderSku> sku;

    public long getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(long jdOrderId) {
        this.jdOrderId = jdOrderId;
    }

    public double getOrderTaxPrice() {
        return orderTaxPrice;
    }

    public void setOrderTaxPrice(double orderTaxPrice) {
        this.orderTaxPrice = orderTaxPrice;
    }

    public double getOrderNakedPrice() {
        return orderNakedPrice;
    }

    public void setOrderNakedPrice(double orderNakedPrice) {
        this.orderNakedPrice = orderNakedPrice;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public List<JdOrderSku> getSku() {
        return sku;
    }

    public void setSku(List<JdOrderSku> sku) {
        this.sku = sku;
    }
}
