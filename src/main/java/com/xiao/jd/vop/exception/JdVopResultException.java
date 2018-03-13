package com.xiao.jd.vop.exception;

import com.xiao.jd.vop.bean.JdVopResult;

/**
 * 〈京东返回异常〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/6 10:51
 * @since 1.0.0
 */
public class JdVopResultException extends Exception {

    private static final long serialVersionUID = -6357149550353160810L;
    private JdVopResult jdVopResult;

    public JdVopResultException(JdVopResult jdVopResult) {
        super(jdVopResult.toString());
        this.jdVopResult = jdVopResult;
    }

    public int getResultCode() {
        return this.jdVopResult.getResultCode();
    }

    public String getResultMessage() {
        return this.jdVopResult.getResultMessage();
    }

}
