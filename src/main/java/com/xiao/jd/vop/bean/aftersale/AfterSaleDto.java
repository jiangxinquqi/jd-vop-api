package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈京东售后服务单〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 15:03
 * @since 1.0.0
 */
public class AfterSaleDto implements Serializable {
    private static final long serialVersionUID = 1717568473764021058L;

    /**
     * 订单号
     */
    private long jdOrderId;
    /**
     * 必填，退货(10)、换货(20)、维修(30)
     */
    private int customerExpect;
    /**
     * 产品问题描述,最多 1000 字符
     */
    private String questionDesc;
    /**
     * 是否需要检测报告
     */
    private boolean isNeedDetectionReport;
    /**
     * 最多 2000 字符支持多张图片，用逗号分隔（英文逗号）
     */
    private String questionPic;
    /**
     * 是否有包装
     */
    private boolean isHasPackage;
    /**
     * 0 无包装 10 包装完整 20 包装破损
     */
    private String packageDesc;
    /**
     * 客户信息实体
     */
    private AfterSaleCustomerDto afterSaleCustomerDto;
    /**
     * 取件信息实体
     */
    private AfterSalePickwareDto afterSalePickwareDto;
    /**
     * 返件信息实体
     */
    private AfterSaleReturnwareDto afterSaleReturnwareDto;
    /**
     * 申请单明细
     */
    private AfterSaleDetailDto afterSaleDetailDto;

}
