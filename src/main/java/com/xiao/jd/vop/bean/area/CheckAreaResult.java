package com.xiao.jd.vop.bean.area;

import java.io.Serializable;

/**
 * 〈京东地址校验结果〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 18:11
 * @since 1.0.0
 */
public class CheckAreaResult implements Serializable {
    private static final long serialVersionUID = 1738198104947725261L;

    /**
     * 是否正确
     */
    private boolean success;
    /**
     * 结果码
     */
    private int resultcode;
    /**
     * 地址信息
     */
    private int addressId;
    /**
     * 错误信息
     */
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
