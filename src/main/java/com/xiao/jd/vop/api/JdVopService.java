package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.JdVopResult;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.http.HttpProxy;

import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * 〈京东大客户平台服务接口〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 11:08
 * @since 1.0.0
 */
public interface JdVopService {

    /**
     * 1.3 获取 Access Token
     */
    String GET_ACCESS_TOKEN_URL = "https://bizapi.jd.com/oauth2/accessToken";

    /**
     * 功能描述: 获取令牌<br>
     *
     * @return: access_token
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:05
     */
    String getAccessToken() throws JdVopResultException;

    /**
     * 功能描述: 获取令牌<br>
     *
     * @param forceRefresh 是否强行刷新access_token
     * @return:
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:05
     */
    String getAccessToken(boolean forceRefresh) throws JdVopResultException;

    /**
     * 功能描述: 初始化HTTP代理<br>
     *
     * @return:
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:05
     */
    void initHttp();

    /**
     * 功能描述: 获取客户端信息<br>
     *
     * @return: JdVopConfigStorage
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:02
     */
    JdVopConfigStorage getJdVopConfigStorage();

    /**
     * 功能描述: 配置客户端信息<br>
     *
     * @param jdVopConfigStorage
     * @return:
     * @Author:jianjun.xiao
     * @Date: 2018/2/7 14:04
     */

    void setJdVopConfigStorage(JdVopConfigStorage jdVopConfigStorage);

    String post(String url, Map<String, Object> params) throws JdVopResultException;

    String get(String url, Map<String, Object> params);

    JdVopResult getJdVopResult(String url, Map<String, Object> params) throws JdVopResultException;

    String getResultString(String jdVopResultJson) throws JdVopResultException;

    <T> T getResultObject(String url, Map<String, Object> params, Class<T> clazz) throws JdVopResultException;

    <T> List<T> getResultArray(String url, Map<String, Object> params, Class<T> clazz) throws JdVopResultException;

    ProductService getProductService();

    OrderService getOrderService();

    AreaService getAreaService();

    PriceService getPriceService();

    StockService getStockService();

    CheckOrderService getCheckOrderService();

    MessageService getMessageService();

    AfterSaleService getAfterSaleService();

}
