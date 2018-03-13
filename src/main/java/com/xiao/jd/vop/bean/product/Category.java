package com.xiao.jd.vop.bean.product;

import java.io.Serializable;

/**
 * 〈商品分类信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 16:49
 * @since 1.0.0
 */
public class Category implements Serializable {
    private static final long serialVersionUID = -5940312350192134747L;

    /**
     * 分类 ID
     */
    private int catId;
    /**
     * 父分类 ID
     */
    private int parentId;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 0：一级分类；1：二级分类；2：三级分类；
     */
    private int catClass;
    /**
     * 1：有效；0：无效；
     */
    private int state;

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatClass() {
        return catClass;
    }

    public void setCatClass(int catClass) {
        this.catClass = catClass;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
