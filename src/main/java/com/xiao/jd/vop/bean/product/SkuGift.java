package com.xiao.jd.vop.bean.product;

import java.io.Serializable;
import java.util.List;

/**
 * 〈赠品信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 16:33
 * @since 1.0.0
 */
public class SkuGift implements Serializable {

    private static final long serialVersionUID = 3349336413167182267L;

    /**
     * 赠品集合
     */
    private List<SkuGiftReqVO> gifts;
    /**
     * 购买要求主商品最大数量（为 0 表示没配置）
     */
    private int maxNum;
    /**
     * 购买要求主商品最小数量（为 0 表示没配置）
     */
    private int minNum;
    /**
     * 促销开始时间
     */
    private long promoStartTime;
    /**
     * 促销结束时间
     */
    private long promoEndTime;

    public List<SkuGiftReqVO> getGifts() {
        return gifts;
    }

    public void setGifts(List<SkuGiftReqVO> gifts) {
        this.gifts = gifts;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public long getPromoStartTime() {
        return promoStartTime;
    }

    public void setPromoStartTime(long promoStartTime) {
        this.promoStartTime = promoStartTime;
    }

    public long getPromoEndTime() {
        return promoEndTime;
    }

    public void setPromoEndTime(long promoEndTime) {
        this.promoEndTime = promoEndTime;
    }

    public class SkuGiftReqVO {
        /**
         * 商品编号
         */
        private long skuId;
        /**
         * 数量
         */
        private int num;
        /**
         * 1：附件 2：赠品
         */
        private int giftType;

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

        public int getGiftType() {
            return giftType;
        }

        public void setGiftType(int giftType) {
            this.giftType = giftType;
        }
    }
}
