package com.xiao.jd.vop.bean.product;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.List;

/**
 * 〈商品池编号〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 15:46
 * @since 1.0.0
 */
public class PageNum implements Serializable {
    /**
     * 商品池名称
     */
    private String name;
    /**
     * 商品池编号
     */
    private String page_num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPage_num() {
        return page_num;
    }

    public void setPage_num(String page_num) {
        this.page_num = page_num;
    }

}
