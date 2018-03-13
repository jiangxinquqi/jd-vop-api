package com.xiao.jd.vop.bean.product;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.List;

/**
 * 〈商品状态〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 10:36
 * @since 1.0.0
 */
public class SkuState implements Serializable {

    /**
     * 商品编号
     */
    private long sku;
    /**
     * 1：上架 0：下架
     */
    private int state;

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
