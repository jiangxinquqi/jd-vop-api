package com.xiao.jd.vop.bean.product;

import java.io.Serializable;

/**
 * 〈商品好评度〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 20:08
 * @since 1.0.0
 */
public class CommentSummarys implements Serializable {
    private static final long serialVersionUID = 3663855709007205449L;

    private long skuId;
    private double averageScore;
    private double goodRate;
    private double generalRate;
    private double poorRate;

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public double getGeneralRate() {
        return generalRate;
    }

    public void setGeneralRate(double generalRate) {
        this.generalRate = generalRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
}
