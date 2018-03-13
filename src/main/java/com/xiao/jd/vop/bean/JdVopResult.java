package com.xiao.jd.vop.bean;

import com.alibaba.fastjson.JSON;

/**
 * 〈京东接口结果对象〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 11:13
 * @since 1.0.0
 */
public class JdVopResult {

    /**
     * 状态码 : true 可申请 false 不可申请
     */
    private boolean success;
    /**
     * 异常代码 Key : 0 无错误信息
     */
    private int resultCode;
    /**
     * 错误信息
     */
    private String resultMessage;
    /**
     * 具体结果：说明，每个接口都会单独进行说明；
     */
    private String result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static JdVopResult parseJson(String resultContent) {
        return JSON.parseObject(resultContent, JdVopResult.class);
    }

    @Override
    public String toString() {
        return "错误: resultCode=" + this.resultCode + ", resultMessage=" + this.resultMessage;
    }

}
