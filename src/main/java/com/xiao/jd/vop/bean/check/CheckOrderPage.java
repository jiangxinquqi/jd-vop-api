package com.xiao.jd.vop.bean.check;

import java.io.Serializable;
import java.util.List;

/**
 * 〈对账分页信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 13:56
 * @since 1.0.0
 */
public class CheckOrderPage implements Serializable {
    private static final long serialVersionUID = 2138768668006158211L;

    private int total;
    private int totalPage;
    private int curPage;
    private List<CheckOrderResVo> orders;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public List<CheckOrderResVo> getOrders() {
        return orders;
    }

    public void setOrders(List<CheckOrderResVo> orders) {
        this.orders = orders;
    }
}
