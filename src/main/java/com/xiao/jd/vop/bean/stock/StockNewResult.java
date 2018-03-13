package com.xiao.jd.vop.bean.stock;

import java.io.Serializable;

/**
 * 〈库存信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 9:25
 * @since 1.0.0
 */
public class StockNewResult implements Serializable {
    private static final long serialVersionUID = 5323330018792586805L;

    /**
     * 配送地址 id
     */
    private String areaId;
    /**
     * 商品编号
     */
    private long skuId;
    /**
     * 库存状态编号 33,39,40,36,34
     */
    private String stockStateId;
    /**
     * 库存状态描述
     * 33 有货 现货-下单立即发货
     * 39 有货 在途-正在内部配货，预计 2~6 天到达本仓库
     * 40 有货 可配货-下单后从有货仓库配货
     * 36 预订
     * 34 无货
     */
    private String StockStateDesc;
    /**
     * 剩余数量 -1 未知；当库存小于 5 时展示真实库存数量
     */
    private int remainNum;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public String getStockStateId() {
        return stockStateId;
    }

    public void setStockStateId(String stockStateId) {
        this.stockStateId = stockStateId;
    }

    public String getStockStateDesc() {
        return StockStateDesc;
    }

    public void setStockStateDesc(String stockStateDesc) {
        StockStateDesc = stockStateDesc;
    }

    public int getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(int remainNum) {
        this.remainNum = remainNum;
    }
}
