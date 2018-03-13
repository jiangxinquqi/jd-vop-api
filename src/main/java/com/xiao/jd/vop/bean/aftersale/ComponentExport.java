package com.xiao.jd.vop.bean.aftersale;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.io.Serializable;

/**
 * 〈ComponentExport〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 16:42
 * @since 1.0.0
 */
public class ComponentExport implements Serializable {
    private static final long serialVersionUID = 240995840623577692L;

    /**
     * 服务类型码  退货(10)、换货(20)、维修(30)
     */
    private String code;
    /**
     * 服务类型名称 退货、换货、维修
     */
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
