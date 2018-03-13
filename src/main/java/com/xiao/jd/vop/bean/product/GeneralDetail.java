package com.xiao.jd.vop.bean.product;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 〈其他实物商品详情〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 17:41
 * @since 1.0.0
 */
public class GeneralDetail extends SkuState {

    /**
     * 重量
     */
    private double weight;
    /**
     * 主图地址
     */
    private String imagePath;
    /**
     * 品牌
     */
    private String brandName;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 产地
     */
    private String productArea;
    /**
     * 条形码
     */
    private String upc;
    /**
     * 销售单位
     */
    private String saleUnit;
    /**
     * 类别
     */
    private String category;
    /**
     * 京东自营礼品卡， 只有当 sku 为京东自营实物礼品卡的时候才有该字段
     */
    private String eleGift;
    /**
     * 详细介绍
     */
    private String introduction;
    /**
     * 规格参数
     */
    private String param;
    /**
     * 包装清单
     */
    private String wareQD;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEleGift() {
        return eleGift;
    }

    public void setEleGift(String eleGift) {
        this.eleGift = eleGift;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getWareQD() {
        return wareQD;
    }

    public void setWareQD(String wareQD) {
        this.wareQD = wareQD;
    }
}
