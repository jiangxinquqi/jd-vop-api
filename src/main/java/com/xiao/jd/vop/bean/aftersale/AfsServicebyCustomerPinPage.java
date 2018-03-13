package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;
import java.util.List;

/**
 * 〈〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 16:03
 * @since 1.0.0
 */
public class AfsServicebyCustomerPinPage implements Serializable {
    private static final long serialVersionUID = 8073814129620611064L;

    private List<AfsServicebyCustomerPin> serviceInfoList;
    private int totalNum;
    private int pageSize;
    private int pageNum;
    private int pageIndex;

    public List<AfsServicebyCustomerPin> getServiceInfoList() {
        return serviceInfoList;
    }

    public void setServiceInfoList(List<AfsServicebyCustomerPin> serviceInfoList) {
        this.serviceInfoList = serviceInfoList;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
}
