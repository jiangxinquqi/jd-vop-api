package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;

/**
 * 〈服务单追踪信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 19:46
 * @since 1.0.0
 */
public class ServiceTrackInfoDTO implements Serializable {
    private static final long serialVersionUID = -3527003112229666871L;

    private int afsServiceId;
    private String title;
    private String context;
    private String createDate;
    private String createName;
    private String createPin;

    public int getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsServiceId(int afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreatePin() {
        return createPin;
    }

    public void setCreatePin(String createPin) {
        this.createPin = createPin;
    }
}
