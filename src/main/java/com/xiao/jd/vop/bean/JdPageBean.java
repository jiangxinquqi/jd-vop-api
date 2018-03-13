package com.xiao.jd.vop.bean;

import java.io.Serializable;

/**
 * 〈分页信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 17:09
 * @since 1.0.0
 */
public class JdPageBean implements Serializable {

    /**
     * 页号
     */
    private int pageNo;
    /**
     * 页大小，最大值 5000；
     */
    private int pageSize;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
