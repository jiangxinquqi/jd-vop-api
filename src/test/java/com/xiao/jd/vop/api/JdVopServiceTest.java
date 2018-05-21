package com.xiao.jd.vop.api;

import com.xiao.jd.vop.api.impl.JdVopInRedisConfigStorage;
import com.xiao.jd.vop.api.impl.JdVopServiceImpl;
import com.xiao.jd.vop.exception.JdVopResultException;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisPool;

/**
 * 〈京东服务测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 11:19
 * @since 1.0.0
 */
public class JdVopServiceTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    protected JdVopService jdVopService;

    @Before
    public void initService() {

        JedisPool jedisPool = new JedisPool("192.168.226.133", 6379);
        // 内部账号
//        JdVopInRedisConfigStorage configStorage = new JdVopInRedisConfigStorage(
//                jedisPool,
//                "xxx",
//                "xxxx",
//                "xxx",
//                "xxxx");

        // 营销账号
        JdVopInRedisConfigStorage configStorage = new JdVopInRedisConfigStorage(
                jedisPool,
                "clientId",
                "clientSecret",
                "username",
                "password");
        jdVopService = new JdVopServiceImpl();
        jdVopService.setJdVopConfigStorage(configStorage);
    }

    // 获取accessToken测试
    @Test
    public void getAccessTokenTest() {
        try {
            System.out.println(this.jdVopService.getAccessToken());
        } catch (JdVopResultException e) {
            e.printStackTrace();
            System.out.println("hahah:" + e.getMessage());
        }
    }

}
