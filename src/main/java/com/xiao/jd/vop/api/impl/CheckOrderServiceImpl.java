package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.api.CheckOrderService;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.bean.check.CheckOrderPage;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈CheckOrderServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 13:46
 * @since 1.0.0
 */
public class CheckOrderServiceImpl implements CheckOrderService {

    private JdVopService jdVopService;

    public CheckOrderServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public CheckOrderPage checkNewOrder(String date, int page) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/checkOrder/checkNewOrder";
        return checkOrder(url, date, page);
    }

    @Override
    public CheckOrderPage checkDlokOrder(String date, int page) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/checkOrder/checkDlokOrder";
        return checkOrder(url, date, page);
    }

    @Override
    public CheckOrderPage checkRefuseOrder(String date, int page) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/checkOrder/checkRefuseOrder";
        return checkOrder(url, date, page);
    }

    public CheckOrderPage checkOrder(String url, String date, int page) throws JdVopResultException {
        Map<String, Object> params = new HashMap<>();
        params.put("date", date);
        params.put("page", page);
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        return JSON.parseObject(result, CheckOrderPage.class);
    }
}
