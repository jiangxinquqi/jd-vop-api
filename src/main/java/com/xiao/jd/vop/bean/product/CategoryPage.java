package com.xiao.jd.vop.bean.product;

import com.xiao.jd.vop.bean.JdPageBean;

import java.util.List;

/**
 * 〈商品分类分页〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 17:12
 * @since 1.0.0
 */
public class CategoryPage extends JdPageBean {
    private static final long serialVersionUID = 3623608468889565151L;

    private int totalRows;

    private List<Category> categorys;

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }
}
