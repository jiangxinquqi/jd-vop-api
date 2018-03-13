package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 15:12
 * @since 1.0.0
 */
public class AfterSaleDetailDto implements Serializable {
    private static final long serialVersionUID = 8796488139921419982L;

    private long skuId;
    private int skuNum;

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public int getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(int skuNum) {
        this.skuNum = skuNum;
    }
}
