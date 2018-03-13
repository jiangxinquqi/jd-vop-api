package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.api.OrderService;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.order.*;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈OrderServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 14:12
 * @since 1.0.0
 */
public class OrderServiceImpl implements OrderService {

    private JdVopService jdVopService;

    public OrderServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public JdFreight getFreight(JdOrder jdOrder) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/getFreight";
        JdArea jdArea = jdOrder.getJdArea();
        Map<String, Object> params = new HashMap<>();
        params.put("sku", jdOrder.getSkuString());
        params.put("province", jdArea.getProvince());
        params.put("city", jdArea.getCity());
        params.put("county", jdArea.getCounty());
        params.put("town", jdArea.getTown());
        params.put("paymentType", jdOrder.getPaymentType());
        return this.jdVopService.getResultObject(url, params, JdFreight.class);
    }

    @Override
    public String selectJdOrderIdByThirdOrder(String thirdOrderId) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/selectJdOrderIdByThirdOrder";
        Map<String, Object> params = new HashMap<>();
        params.put("thirdOrder", thirdOrderId);
        return this.jdVopService.getResultString(this.jdVopService.post(url, params));
    }

    @Override
    public JdOrderDetail selectJdOrder(long jdOrderId) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/selectJdOrder";
        Map<String, Object> params = new HashMap<>();
        params.put("jdOrderId", jdOrderId);
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));

        int type = JSON.parseObject(result).getInteger("type");
        if (type == 1) {
            // 如果是父订单
            return JSON.parseObject(result, JdParentOrderDetail.class);
        }
        return JSON.parseObject(result, JdChildrenOrderDetail.class);
    }

    @Override
    public OrderTrackDetail orderTrack(long jdOrderId) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/orderTrack";
        Map<String, Object> params = new HashMap<>();
        params.put("jdOrderId", jdOrderId);
        return this.jdVopService.getResultObject(url, params, OrderTrackDetail.class);
    }
}