package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.api.PriceService;
import com.xiao.jd.vop.bean.price.BalanceDetailPage;
import com.xiao.jd.vop.bean.price.BalanceDetailPageReqVo;
import com.xiao.jd.vop.bean.price.JincaiCredit;
import com.xiao.jd.vop.bean.price.SellPrice;
import com.xiao.jd.vop.bean.product.SkuPage;
import com.xiao.jd.vop.exception.JdVopResultException;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈PriceServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 18:39
 * @since 1.0.0
 */
public class PriceServiceImpl implements PriceService {
    private JdVopService jdVopService;

    public PriceServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public List<SellPrice> getSellPrice(List<Long> sku) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/price/getSellPrice";
        Map<String, Object> params = new HashMap<>();
        params.put("sku", SkuPage.getSkuString(sku));
        return this.jdVopService.getResultArray(url,params,SellPrice.class);
    }

    @Override
    public String getBalance(int payType) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/price/getBalance";
        Map<String, Object> params = new HashMap<>();
        params.put("payType", payType);
        return this.jdVopService.getResultString(this.jdVopService.post(url, params));
    }

    @Override
    public JincaiCredit selectJincaiCredit() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/price/selectJincaiCredit";
        Map<String, Object> params = new HashMap<>();
        return this.jdVopService.getResultObject(url,params,JincaiCredit.class);
    }

    @Override
    public BalanceDetailPage getBalanceDetail(BalanceDetailPageReqVo balanceDetailPageReqVo) throws JdVopResultException, NoSuchFieldException {
        String url = "https://bizapi.jd.com/api/price/getBalanceDetail";
        Map<String, Object> params = new HashMap<>();
        params.put("pageNum", balanceDetailPageReqVo.getPageNum());
        params.put("pageSize", balanceDetailPageReqVo.getPageSize());
        String orderId = balanceDetailPageReqVo.getOrderId();
        String startDate = balanceDetailPageReqVo.getStartDate();
        String endDate = balanceDetailPageReqVo.getEndDate();
        if (!StringUtils.isEmpty(orderId)) {
            params.put("orderId", orderId);
        }
        if (!StringUtils.isEmpty(startDate)) {
            params.put("startDate", startDate);
        }
        if (!StringUtils.isEmpty(endDate)) {
            params.put("endDate", endDate);
        }

        return this.jdVopService.getResultObject(url,params,BalanceDetailPage.class);
    }
}
