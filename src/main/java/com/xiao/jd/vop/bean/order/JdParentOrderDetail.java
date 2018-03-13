package com.xiao.jd.vop.bean.order;

import java.util.List;

/**
 * 〈京东父订单详情〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 11:43
 * @since 1.0.0
 */
public class JdParentOrderDetail implements JdOrderDetail{

    private List<JdChildrenOrderDetail> cOrder;
    private List<JdParentOrder> pOrder;
    private int type;
    private int orderState;
    private int submitState;

    public List<JdChildrenOrderDetail> getcOrder() {
        return cOrder;
    }

    public void setcOrder(List<JdChildrenOrderDetail> cOrder) {
        this.cOrder = cOrder;
    }

    public List<JdParentOrder> getpOrder() {
        return pOrder;
    }

    public void setpOrder(List<JdParentOrder> pOrder) {
        this.pOrder = pOrder;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getOrderState() {
        return orderState;
    }

    @Override
    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    @Override
    public int getSubmitState() {
        return submitState;
    }

    @Override
    public void setSubmitState(int submitState) {
        this.submitState = submitState;
    }
}
