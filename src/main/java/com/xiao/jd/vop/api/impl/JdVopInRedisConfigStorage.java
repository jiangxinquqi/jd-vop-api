package com.xiao.jd.vop.api.impl;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 〈JdVopInRedisConfigStorage〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 14:56
 * @since 1.0.0
 */
public class JdVopInRedisConfigStorage extends JdVopInMemoryConfigStorage {

    protected final JedisPool jedisPool;

    private String accessTokenKey;

    public JdVopInRedisConfigStorage(JedisPool jedisPool, String clientId, String clientSecret, String username, String password) {
        super(clientId, clientSecret, username, password);
        this.jedisPool = jedisPool;
        this.accessTokenKey = "jd:" + clientId + ":" + username + ":access_token";
    }

    @Override
    public String getAccessToken() {
        Jedis jedis = this.jedisPool.getResource();
        String accessToken = "";
        try {
            accessToken = jedis.get(this.accessTokenKey);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return accessToken;
    }

    @Override
    public boolean isAccessTokenExpired() {
        Jedis jedis = this.jedisPool.getResource();
        boolean isAccessTokenExpired = false;
        try {
            isAccessTokenExpired = jedis.ttl(this.accessTokenKey).longValue() < 2L;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return isAccessTokenExpired;
    }

    @Override
    public synchronized void updateAccessToken(String accessToken, long expiresIn) {
        Jedis jedis = this.jedisPool.getResource();
        try {
            jedis.setex(this.accessTokenKey, (int) (expiresIn - 3600), accessToken);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }

    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public String getAccessTokenKey() {
        return accessTokenKey;
    }

    public void setAccessTokenKey(String accessTokenKey) {
        this.accessTokenKey = accessTokenKey;
    }
}
