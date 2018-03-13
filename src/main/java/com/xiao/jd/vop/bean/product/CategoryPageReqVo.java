package com.xiao.jd.vop.bean.product;

import com.xiao.jd.vop.bean.JdPageBean;

import java.io.Serializable;
import java.util.List;

/**
 * 〈分类信息查询对象〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 17:00
 * @since 1.0.0
 */
public class CategoryPageReqVo extends JdPageBean {
    private static final long serialVersionUID = 467011845075410469L;

    /**
     * 父 ID
     */
    private int parentId;
    /**
     * 分类等级（0:一级； 1:二级；2：三级）
     */
    private int catClass;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getCatClass() {
        return catClass;
    }

    public void setCatClass(int catClass) {
        this.catClass = catClass;
    }
}
