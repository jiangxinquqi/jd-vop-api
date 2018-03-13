package com.xiao.jd.vop.bean.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 〈京东配送信息查询结果〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 12:22
 * @since 1.0.0
 */
public class OrderTrackDetail implements Serializable {
    private static final long serialVersionUID = -2759975365293815058L;

    private long jdOrderId;
    private List<OrderTrackDetailResVo> orderTrack;

    public long getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(long jdOrderId) {
        this.jdOrderId = jdOrderId;
    }

    public List<OrderTrackDetailResVo> getOrderTrack() {
        return orderTrack;
    }

    public void setOrderTrack(List<OrderTrackDetailResVo> orderTrack) {
        this.orderTrack = orderTrack;
    }

    public class OrderTrackDetailResVo {
        /**
         * 日期，操作时间
         */
        private Date msgTime;
        /**
         * 配送内容信息
         */
        private String content;
        /**
         * 操作人
         */
        private String operator;

        public Date getMsgTime() {
            return msgTime;
        }

        public void setMsgTime(Date msgTime) {
            this.msgTime = msgTime;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }
    }
}
