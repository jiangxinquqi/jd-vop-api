package com.xiao.jd.vop.bean.order;

import java.io.Serializable;

/**
 * 〈运费〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 11:37
 * @since 1.0.0
 */
public class JdFreight implements Serializable {

    /**
     * 总运费
     */
    private double freight;
    /**
     * 基础运费
     */
    private double baseFreight;
    /**
     * 偏远运费
     */
    private double remoteRegionFreight;
    /**
     * 需收取偏远运费的 sku
     */
    private String remoteSku;

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public double getBaseFreight() {
        return baseFreight;
    }

    public void setBaseFreight(double baseFreight) {
        this.baseFreight = baseFreight;
    }

    public double getRemoteRegionFreight() {
        return remoteRegionFreight;
    }

    public void setRemoteRegionFreight(double remoteRegionFreight) {
        this.remoteRegionFreight = remoteRegionFreight;
    }

    public String getRemoteSku() {
        return remoteSku;
    }

    public void setRemoteSku(String remoteSku) {
        this.remoteSku = remoteSku;
    }
}
