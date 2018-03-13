package com.xiao.jd.vop.bean.order;

import java.io.Serializable;

/**
 * 〈京东订单项〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 15:03
 * @since 1.0.0
 */
public class JdOrderItem implements Serializable {
    private static final long serialVersionUID = 5169951989598409160L;

    /**
     * 商品编号
     */
    private long skuId;
    /**
     * 商品数量
     */
    private int num;

    public JdOrderItem() {
    }

    public JdOrderItem(long skuId, int num) {
        this.skuId = skuId;
        this.num = num;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
