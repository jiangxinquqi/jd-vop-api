package com.xiao.jd.vop.utils.http;

import java.util.Map;
import java.util.Objects;

/**
 * 〈http客户端代理〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 11:20
 * @since 1.0.0
 */
public interface HttpProxy {

    /**
     * 功能描述: POST请求<br>
     *
     * @param url    请求地址
     * @param params 请求参数
     * @return: String
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 11:22
     */
    String post(String url, Map<String, Object> params);

    /**
     * 功能描述: GET<br>
     *
     * @param url    请求地址
     * @param params 请求参数，map集合
     * @return: String
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 11:22
     */
    String get(String url, Map<String, Object> params);


}
