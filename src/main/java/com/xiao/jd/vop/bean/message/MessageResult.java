package com.xiao.jd.vop.bean.message;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * 〈信息推送结果〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 14:30
 * @since 1.0.0
 */
public class MessageResult implements Serializable {
    private static final long serialVersionUID = 2615115824430173064L;

    /**
     * 消息编码
     */
    private long id;
    /**
     * 消息
     */
    private Map<String, Long> result;
    /**
     * 时间
     */
    private Date time;
    /**
     * 消息类型
     */
    private int type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, Long> getResult() {
        return result;
    }

    public void setResult(Map<String, Long> result) {
        this.result = result;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
