package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.api.*;
import com.xiao.jd.vop.bean.AccessToken;
import com.xiao.jd.vop.bean.JdVopResult;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.MD5Util;
import com.xiao.jd.vop.utils.http.HttpProxy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/**
 * 〈JdVopServiceAbstractImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 13:18
 * @since 1.0.0
 */
public abstract class JdVopServiceAbstractImpl implements JdVopService {

    protected JdVopConfigStorage jdVopConfigStorage;
    protected HttpProxy httpProxy;

    private ProductService productService = new ProdectServiceImpl(this);
    private OrderService orderService = new OrderServiceImpl(this);
    private AreaService areaService = new AreaServiceImpl(this);
    private PriceService priceService = new PriceServiceImpl(this);
    private StockService stockService = new StockServiceImpl(this);
    private CheckOrderService checkOrderService = new CheckOrderServiceImpl(this);
    private MessageService messageService = new MessageServiceImpl(this);
    private AfterSaleService afterSaleService = new AfterSaleServiceImpl(this);

    @Override
    public String getAccessToken() throws JdVopResultException {
        return this.getAccessToken(false);
    }

    @Override
    public String getResultString(String jdVopResultJson) throws JdVopResultException {
        JdVopResult jdVopResult = JdVopResult.parseJson(jdVopResultJson);
        if (!jdVopResult.isSuccess()) {
            throw new JdVopResultException(jdVopResult);
        }
        return jdVopResult.getResult();
    }

    @Override
    public synchronized String getAccessToken(boolean forceRefresh) throws JdVopResultException {
        // 获取线程锁
        Lock lock = this.getJdVopConfigStorage().getAccessTokenLock();
        try {

            lock.lock();
            if (this.getJdVopConfigStorage().isAccessTokenExpired() || forceRefresh) {
                String grantType = JdVopConfigStorage.GRANT_TYPE;
                String scope = JdVopConfigStorage.SCOPE;
                String clientId = this.getJdVopConfigStorage().getClientId();
                String clientSecret = this.getJdVopConfigStorage().getClientSecret();
                String username = this.getJdVopConfigStorage().getUsername();
                String password = MD5Util.MD5EncodeUTF8(this.getJdVopConfigStorage().getPassword());

                Map<String, Object> params = new HashMap<>();
                params.put("grant_type", grantType);
                params.put("scope", scope);
                params.put("client_id", clientId);
                params.put("client_secret", clientSecret);
                params.put("username", username);
                params.put("password", password);

                // 格式化时间戳
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timestamp = simpleDateFormat.format(new Date());
                params.put("timestamp", timestamp);
                // 计算签名
                String signTemp = clientSecret + timestamp + clientId + username + password
                        + grantType + scope + clientSecret;
                params.put("sign", MD5Util.MD5EncodeUTF8(signTemp).toUpperCase());
                String result = this.httpProxy.post(JdVopService.GET_ACCESS_TOKEN_URL, params);
                // 从服务端刷新access_token
                JdVopResult jdVopResult = JdVopResult.parseJson(result);
                if (!jdVopResult.isSuccess()) {
                    throw new JdVopResultException(jdVopResult);
                }

                // 更新本地access_token
                AccessToken accessToken = AccessToken.parseJson(jdVopResult.getResult());
                this.getJdVopConfigStorage().updateAccessToken(accessToken.getAccess_token(), accessToken.getExpires_in());
            }

        } finally {
            lock.unlock();
        }
        return this.getJdVopConfigStorage().getAccessToken();
    }

    @Override
    public JdVopConfigStorage getJdVopConfigStorage() {
        return this.jdVopConfigStorage;
    }

    @Override
    public void setJdVopConfigStorage(JdVopConfigStorage jdVopConfigStorage) {
        this.jdVopConfigStorage = jdVopConfigStorage;
        this.initHttp();
    }

    @Override
    public String post(String url, Map<String, Object> params) throws JdVopResultException {
        params.put("token", this.getAccessToken());
        return httpProxy.post(url, params);
    }

    @Override
    public String get(String url, Map<String, Object> params) {
        return httpProxy.post(url, params);
    }

    @Override
    public JdVopResult getJdVopResult(String url, Map<String, Object> params) throws JdVopResultException {
        return JSON.parseObject(this.post(url, params), JdVopResult.class);
    }

    @Override
    public <T> T getResultObject(String url, Map<String, Object> params, Class<T> clazz) throws JdVopResultException {
        String result = this.getResultString(this.post(url, params));
        return JSON.parseObject(result, clazz);
    }

    @Override
    public <T> List<T> getResultArray(String url, Map<String, Object> params, Class<T> clazz) throws JdVopResultException {
        String result = this.getResultString(this.post(url, params));
        return JSON.parseArray(result, clazz);
    }

    @Override
    public ProductService getProductService() {
        return this.productService;
    }

    @Override
    public OrderService getOrderService() {
        return this.orderService;
    }

    @Override
    public AreaService getAreaService() {
        return this.areaService;
    }

    @Override
    public PriceService getPriceService() {
        return this.priceService;
    }

    @Override
    public StockService getStockService() {
        return this.stockService;
    }

    @Override
    public CheckOrderService getCheckOrderService() {
        return this.checkOrderService;
    }

    @Override
    public MessageService getMessageService() {
        return this.messageService;
    }

    @Override
    public AfterSaleService getAfterSaleService() {
        return this.afterSaleService;
    }
}
