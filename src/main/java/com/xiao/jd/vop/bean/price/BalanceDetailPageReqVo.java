package com.xiao.jd.vop.bean.price;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈余额明细分页请求对象〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 12:55
 * @since 1.0.0
 */
public class BalanceDetailPageReqVo implements Serializable {
    private static final long serialVersionUID = 5756246289397609444L;

    /**
     * 分页查询当前页数，默认为 1
     */
    private int pageNum = 1;
    /**
     * 每页记录数，默认为 20
     */
    private int pageSize = 20;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 开始日期，格式必须：yyyyMMdd
     */
    private String startDate;
    /**
     * 截止日期，格式必须：yyyyMMdd
     */
    private String endDate;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        this.startDate = simpleDateFormat.format(startDate);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        this.endDate = simpleDateFormat.format(endDate);
    }
}
