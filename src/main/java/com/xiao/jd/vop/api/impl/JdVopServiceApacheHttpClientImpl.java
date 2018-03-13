package com.xiao.jd.vop.api.impl;

import com.xiao.jd.vop.utils.http.apache.ApacheHttpClient;

/**
 * 〈JdVopServiceApacheHttpClientImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 13:44
 * @since 1.0.0
 */
public class JdVopServiceApacheHttpClientImpl extends JdVopServiceAbstractImpl {
    @Override
    public void initHttp() {
        this.httpProxy = new ApacheHttpClient();
    }
}
