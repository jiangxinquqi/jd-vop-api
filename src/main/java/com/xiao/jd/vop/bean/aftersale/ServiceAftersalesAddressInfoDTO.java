package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈售后地址信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 19:39
 * @since 1.0.0
 */
public class ServiceAftersalesAddressInfoDTO implements Serializable {
    private static final long serialVersionUID = -8412243345742164041L;

    private String address;
    private String tel;
    private String linkMan;
    private String postCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
