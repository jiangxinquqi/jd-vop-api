package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.api.StockService;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.order.JdOrderItem;
import com.xiao.jd.vop.bean.product.SkuPage;
import com.xiao.jd.vop.bean.stock.StockNewResult;
import com.xiao.jd.vop.bean.stock.StockResult;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈StockServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 18:57
 * @since 1.0.0
 */
public class StockServiceImpl implements StockService {

    private JdVopService jdVopService;

    public StockServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public List<StockNewResult> getNewStockById(List<JdOrderItem> skuNums, JdArea jdArea) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/stock/getNewStockById";
        Map<String, Object> params = new HashMap<>();
        params.put("skuNums", JSON.toJSONString(skuNums));
        params.put("area", jdArea.getAreaStringOf3(jdArea));
        return this.jdVopService.getResultArray(url,params,StockNewResult.class);
    }

    @Override
    public List<StockResult> getStockById(List<Long> sku, JdArea jdArea) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/stock/getStockById";
        Map<String, Object> params = new HashMap<>();
        params.put("sku", SkuPage.getSkuString(sku));
        params.put("area", jdArea.getAreaStringOf3(jdArea));
        return this.jdVopService.getResultArray(url,params,StockResult.class);
    }
}
