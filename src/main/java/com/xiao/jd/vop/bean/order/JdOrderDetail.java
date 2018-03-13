package com.xiao.jd.vop.bean.order;

/**
 * 〈京东订单详情〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 11:38
 * @since 1.0.0
 */
public interface JdOrderDetail {

    void setType(int type);

    int getType();

    void setSubmitState(int submitState);

    int getSubmitState();

    void setOrderState(int orderState);

    int getOrderState();

}
