package com.xiao.jd.vop.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 〈AccessToken〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 14:37
 * @since 1.0.0
 */
public class AccessToken implements Serializable {
    private String uid;
    /**
     * 调接口使用
     */
    private String access_token;
    /**
     * Access_token 的过期时间，秒级别,有效期 24 小时
     */
    private long expires_in;
    /**
     * Access_token 过期时，刷新使用
     */
    private String refresh_token;
    /**
     * refresh_token 的过期时间，毫秒级别
     */
    private long refresh_token_expires;
    /**
     * 当前时间
     */
    private long time;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public long getRefresh_token_expires() {
        return refresh_token_expires;
    }

    public void setRefresh_token_expires(long refresh_token_expires) {
        this.refresh_token_expires = refresh_token_expires;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public static AccessToken parseJson(String json) {
        return JSON.parseObject(json, AccessToken.class);
    }
}
