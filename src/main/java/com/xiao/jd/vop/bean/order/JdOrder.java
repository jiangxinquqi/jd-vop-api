package com.xiao.jd.vop.bean.order;


import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.bean.area.JdArea;

import java.io.Serializable;
import java.util.List;

/**
 * 〈京东订单信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 13:42
 * @since 1.0.0
 */
public class JdOrder implements Serializable {
    private static final long serialVersionUID = 2364636573225117638L;

    /**
     * 京东订单项
     */
    private List<JdOrderItem> sku;

    /**
     * 订单地址
     */
    private JdArea jdArea;

    /**
     * 支付方式 (1：货到付款，2：邮局付款，4：在线支付，5：公司转账，6：银行转账，7：网银钱包，101：金采支付)
     */
    private int paymentType;

    public String getSkuString() {
        return JSON.toJSONString(this.sku);
    }

    public JdOrder() {
    }

    public JdOrder(List<JdOrderItem> sku, JdArea jdArea, int paymentType) {
        this.sku = sku;
        this.jdArea = jdArea;
        this.paymentType = paymentType;
    }

    public List<JdOrderItem> getSku() {
        return sku;
    }

    public void setSku(List<JdOrderItem> sku) {
        this.sku = sku;
    }

    public JdArea getJdArea() {
        return this.jdArea;
    }

    public void setJdArea(JdArea jdArea) {
        this.jdArea = jdArea;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

}
