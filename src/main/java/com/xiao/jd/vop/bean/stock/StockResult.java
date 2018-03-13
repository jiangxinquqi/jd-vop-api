package com.xiao.jd.vop.bean.stock;

import java.io.Serializable;

/**
 * 〈京东库存信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 9:52
 * @since 1.0.0
 */
public class StockResult implements Serializable {
    private static final long serialVersionUID = 6270018860718585946L;


    /**
     * 地址
     */
    private String area;
    /**
     * 库存状态描述
     * 有货 现货
     * 有货 在途
     */
    private String desc;
    /**
     * 商品编号
     */
    private long sku;
    /**
     * 库存状态编号
     * 33 有货 现货-下单立即发货
     * 39 有货 在途-正在内部配货，预计 2~6 天到达本仓库
     * 40 有货 可配货-下单后从有货仓库配货
     * 36 预订
     * 34 无货
     */
    private int state;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

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
