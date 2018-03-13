package com.xiao.jd.vop.api;

import java.util.concurrent.locks.Lock;

/**
 * 〈京东账号配置接口〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 11:10
 * @since 1.0.0
 */
public interface JdVopConfigStorage {

    String GRANT_TYPE = "access_token";
    /**
     * 申请权限
     */
    String SCOPE = "";

    /**
     * 功能描述: 更新本地access_token <br>
     *
     * @param accessToken 最新的access_token
     * @param expiresIn   access_token过期时间,单位秒,有效期24小时
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:39
     */
    void updateAccessToken(String accessToken, long expiresIn);

    /**
     * 功能描述: 获取当前内存中的accessToken<br>
     *
     * @return:
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:16
     */
    String getAccessToken();

    /**
     * 功能描述: 校验access_token是否过期<br>
     *
     * @return: isAccessTokenExpired
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:11
     */
    boolean isAccessTokenExpired();

    /**
     * 功能描述: 获取线程锁<br>
     *
     * @return: java.util.concurrent.locks.Lock
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:11
     */
    Lock getAccessTokenLock();

    String getClientId();

    String getClientSecret();

    String getUsername();

    String getPassword();
}
