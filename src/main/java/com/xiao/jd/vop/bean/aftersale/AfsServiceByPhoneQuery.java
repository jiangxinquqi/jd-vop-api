package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 16:01
 * @since 1.0.0
 */
public class AfsServiceByPhoneQuery implements Serializable {
    private static final long serialVersionUID = 199787468270249736L;

    private long jdOrderId;
    private int pageSize;
    private int pageIndex;

    public AfsServiceByPhoneQuery(long jdOrderId, int pageSize, int pageIndex) {
        this.jdOrderId = jdOrderId;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    public long getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(long jdOrderId) {
        this.jdOrderId = jdOrderId;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
}
