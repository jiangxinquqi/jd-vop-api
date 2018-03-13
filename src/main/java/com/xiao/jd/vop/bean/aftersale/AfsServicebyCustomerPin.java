package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 16:05
 * @since 1.0.0
 */
public class AfsServicebyCustomerPin implements Serializable {
    private static final long serialVersionUID = -7502085988081667888L;

    /**
     * 服务单号
     */
    private int afsServiceId;
    /**
     * 服务类型码 退货(10)、换货(20)、维修(30)
     */
    private int customerExpect;
    /**
     * 服务类型名称
     */
    private String customerExpectName;
    /**
     * 服务单申请时间 格式 : yyyy-MM-dd HH:mm:ss
     */
    private String afsApplyTime;
    /**
     * 订单号
     */
    private long orderId;
    /**
     * 商品编号
     */
    private long wareId;
    /**
     * 商品名称
     */
    private String wareName;
    /**
     * 服务单环节
     * 申请阶段(10),
     * 审核不通过(20),
     * 客服审核(21),
     * 商家审核(22),
     * 京东收货(31),
     * 商家收货(32),
     * 京东处理(33),
     * 商家处理(34),
     * 用户确认(40),
     * 完成(50),
     * 取消(60);
     */
    private int afsServiceStep;
    /**
     * 服务单环节名称
     */
    private String afsServiceStepName;
    /**
     * 是否可取消
     */
    private int cancel;

    public int getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsServiceId(int afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public int getCustomerExpect() {
        return customerExpect;
    }

    public void setCustomerExpect(int customerExpect) {
        this.customerExpect = customerExpect;
    }

    public String getCustomerExpectName() {
        return customerExpectName;
    }

    public void setCustomerExpectName(String customerExpectName) {
        this.customerExpectName = customerExpectName;
    }

    public String getAfsApplyTime() {
        return afsApplyTime;
    }

    public void setAfsApplyTime(String afsApplyTime) {
        this.afsApplyTime = afsApplyTime;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getWareId() {
        return wareId;
    }

    public void setWareId(long wareId) {
        this.wareId = wareId;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public int getAfsServiceStep() {
        return afsServiceStep;
    }

    public void setAfsServiceStep(int afsServiceStep) {
        this.afsServiceStep = afsServiceStep;
    }

    public String getAfsServiceStepName() {
        return afsServiceStepName;
    }

    public void setAfsServiceStepName(String afsServiceStepName) {
        this.afsServiceStepName = afsServiceStepName;
    }

    public int getCancel() {
        return cancel;
    }

    public void setCancel(int cancel) {
        this.cancel = cancel;
    }
}
