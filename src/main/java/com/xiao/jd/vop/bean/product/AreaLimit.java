package com.xiao.jd.vop.bean.product;

import java.io.Serializable;

/**
 * 〈区域购买限制〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 15:49
 * @since 1.0.0
 */
public class AreaLimit implements Serializable {
    private static final long serialVersionUID = 2120338512678049378L;

    /**
     * 商品编号
     */
    private long skuId;
    /**
     * True 区域限制 false 不受区域限制
     */
    private boolean isAreaRestrict;

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public boolean isAreaRestrict() {
        return isAreaRestrict;
    }

    public void setAreaRestrict(boolean areaRestrict) {
        isAreaRestrict = areaRestrict;
    }
}
