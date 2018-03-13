package com.xiao.jd.vop.bean.product;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.List;

/**
 * 〈商品编号分页〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 16:31
 * @since 1.0.0
 */
public class SkuPage implements Serializable {

    /**
     * 总页码
     */
    private int pageCount;
    /**
     * 商品编码
     */
    private List<Long> skuIds;

    /**
     * 商品编号格式化
     *
     * @param skus 商品编号集合
     * @return: 格式化之后的商品编号
     * @Author:jianjun.xiao
     * @Date: 2018/2/8 10:24
     */
    public static String getSkuString(List<Long> skus) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < skus.size(); i++) {
            builder.append(skus.get(i) + ",");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<Long> getSkuIds() {
        return skuIds;
    }

    public void setSkuIds(List<Long> skuIds) {
        this.skuIds = skuIds;
    }
}
