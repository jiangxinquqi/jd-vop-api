package com.xiao.jd.vop.bean.product;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * 〈同类商品信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 17:22
 * @since 1.0.0
 */
public class SimilarProduct implements Serializable {
    private static final long serialVersionUID = -1021293454077314269L;

    /**
     * 维度
     */
    private int dim;
    /**
     * 销售名称
     */
    private String saleName;
    /**
     * 商品销售标签
     * 销售属性下可能只有一个标签，此种场景可以选择显示销售名称和标签，也可以不显示
     */
    private List<SaleAttr> saleAttrList;

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public List<SaleAttr> getSaleAttrList() {
        return saleAttrList;
    }

    public void setSaleAttrList(List<SaleAttr> saleAttrList) {
        this.saleAttrList = saleAttrList;
    }

    public class SaleAttr {
        /**
         * 标签图片地址,当前只有第一维度别名【颜色】提供，只是相对路径，需要加上京东图片服务器 url
         */
        private String imagePath;
        /**
         * 标签名称,会返回当前标签下所有的商品，根据不同维度销售名称下标签含有的 skuIds 的交集，自主判
         * 定需要重新定向的 skuId,并且可以用于多级维度销售别称联动的控制。
         */
        private String saleValue;
        /**
         * 当前标签下的同类商品 skuId
         */
        private Set<Long> skuIds;

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public String getSaleValue() {
            return saleValue;
        }

        public void setSaleValue(String saleValue) {
            this.saleValue = saleValue;
        }

        public Set<Long> getSkuIds() {
            return skuIds;
        }

        public void setSkuIds(Set<Long> skuIds) {
            this.skuIds = skuIds;
        }
    }
}
