package com.xiao.jd.vop.bean.order;

/**
 * 〈京东子订单详情〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 11:48
 * @since 1.0.0
 */
public class JdChildrenOrderDetail extends JdParentOrder implements JdOrderDetail{

    private long pOrder;
    private int state;
    private int type;
    private int orderState;
    private int submitState;

    public long getpOrder() {
        return pOrder;
    }

    public void setpOrder(long pOrder) {
        this.pOrder = pOrder;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
