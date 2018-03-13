package com.xiao.jd.vop.bean.product;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈图片信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 11:03
 * @since 1.0.0
 */
public class SkuImage implements Serializable {

    private long id;
    private long skuId;
    private String path;
    private Date created;
    private Date modified;
    private int yn;
    private int isPrimary;
    private int orderSort;
    private int position;
    private int type;
    private String features;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }

    public int getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(int isPrimary) {
        this.isPrimary = isPrimary;
    }

    public int getOrderSort() {
        return orderSort;
    }

    public void setOrderSort(int orderSort) {
        this.orderSort = orderSort;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
