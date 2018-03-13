package com.xiao.jd.vop.api.impl;

import com.xiao.jd.vop.api.JdVopConfigStorage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈京东配置内存存储器〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 13:51
 * @since 1.0.0
 */
public class JdVopInMemoryConfigStorage implements JdVopConfigStorage {
    /**
     * 即对接账号(由京东人员提供)
     */
    protected volatile String clientId;
    /**
     * 即对接账号的密码 (由京东人员提供)
     */
    protected volatile String clientSecret;
    /**
     * 京东的用户名
     */
    protected volatile String username;
    /**
     * 京东的用户密码
     */
    protected volatile String password;


    /**
     * 存储在内存中的access_token
     */
    protected volatile String accessToken;
    /**
     * 存储在内存中的access_token的过期时间
     */
    protected volatile long expiresTime;

    protected Lock accessTokenLock = new ReentrantLock();

    public JdVopInMemoryConfigStorage() {
    }

    public JdVopInMemoryConfigStorage(String clientId, String clientSecret, String username, String password) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.username = username;
        this.password = password;
    }

    @Override
    public void updateAccessToken(String accessToken, long expiresIn) {
        this.accessToken = accessToken;
        // 提前一个小时过期
        this.expiresTime = System.currentTimeMillis() + (long) (expiresIn - 3600) * 1000L;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(long expiresTime) {
        this.expiresTime = expiresTime;
    }

    @Override
    public boolean isAccessTokenExpired() {
        return System.currentTimeMillis() > this.expiresTime;
    }

    @Override
    public Lock getAccessTokenLock() {
        return accessTokenLock;
    }

    public void setAccessTokenLock(Lock accessTokenLock) {
        this.accessTokenLock = accessTokenLock;
    }
}
