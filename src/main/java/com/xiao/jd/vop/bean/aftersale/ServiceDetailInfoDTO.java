package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈服务单商品明细〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 19:47
 * @since 1.0.0
 */
public class ServiceDetailInfoDTO implements Serializable {
    private static final long serialVersionUID = -5668938254086582993L;

    private int wareId;
    private String wareName;
    private String wareBrand;
    private int afsDetailType;
    private String wareDescribe;

    public int getWareId() {
        return wareId;
    }

    public void setWareId(int wareId) {
        this.wareId = wareId;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareBrand() {
        return wareBrand;
    }

    public void setWareBrand(String wareBrand) {
        this.wareBrand = wareBrand;
    }

    public int getAfsDetailType() {
        return afsDetailType;
    }

    public void setAfsDetailType(int afsDetailType) {
        this.afsDetailType = afsDetailType;
    }

    public String getWareDescribe() {
        return wareDescribe;
    }

    public void setWareDescribe(String wareDescribe) {
        this.wareDescribe = wareDescribe;
    }
}
