package com.xiao.jd.vop.bean.price;

import java.io.Serializable;

/**
 * 〈金彩余额〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 12:44
 * @since 1.0.0
 */
public class JincaiCredit implements Serializable {
    private static final long serialVersionUID = -3681854203411216259L;

    /**
     * 授信额度
     */
    private double creditLimit;
    /**
     * 可用额度
     */
    private double remainLimit;
    /**
     * 待还款总额
     */
    private double debtSumAmt;
    /**
     * 违约金总额
     */
    private double penaltySumAmt;

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getRemainLimit() {
        return remainLimit;
    }

    public void setRemainLimit(double remainLimit) {
        this.remainLimit = remainLimit;
    }

    public double getDebtSumAmt() {
        return debtSumAmt;
    }

    public void setDebtSumAmt(double debtSumAmt) {
        this.debtSumAmt = debtSumAmt;
    }

    public double getPenaltySumAmt() {
        return penaltySumAmt;
    }

    public void setPenaltySumAmt(double penaltySumAmt) {
        this.penaltySumAmt = penaltySumAmt;
    }
}
