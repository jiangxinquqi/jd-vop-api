package com.xiao.jd.vop.bean.price;

import com.xiao.jd.vop.bean.JdPageBean;

import java.io.Serializable;
import java.util.List;

/**
 * 〈余额明细〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 13:00
 * @since 1.0.0
 */
public class BalanceDetailPage extends JdPageBean implements Serializable {
    private static final long serialVersionUID = 8799980624042487153L;

    /**
     * 记录总条数
     */
    private int total;
    /**
     * 总页数
     */
    private int pageCount;

    /**
     * 余额明细
     */
    private List<BalanceDetail> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<BalanceDetail> getData() {
        return data;
    }

    public void setData(List<BalanceDetail> data) {
        this.data = data;
    }
}
