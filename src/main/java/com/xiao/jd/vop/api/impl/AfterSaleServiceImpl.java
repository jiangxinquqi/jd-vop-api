package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.api.AfterSaleService;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.bean.aftersale.*;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈AfterSaleServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 14:58
 * @since 1.0.0
 */
public class AfterSaleServiceImpl implements AfterSaleService {

    private JdVopService jdVopService;

    public AfterSaleServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public boolean createAfsApply(AfterSaleDto afterSaleDto) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/createAfsApply";
        Map<String, Object> params = new HashMap<>();
        params.put("param", JSON.toJSONString(afterSaleDto));
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        if ("true".equalsIgnoreCase(result)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateSendSku(AfsCustomerDeliverDetailDto afsCustomerDeliverDetailDto) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/updateSendSku";
        Map<String, Object> params = new HashMap<>();
        params.put("param", JSON.toJSONString(afsCustomerDeliverDetailDto));
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        if ("true".equalsIgnoreCase(result)) {
            return true;
        }
        return false;
    }

    @Override
    public int getAvailableNumberComp(long jdOrderId, long skuId) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/getAvailableNumberComp";
        Map<String, Object> params = new HashMap<>();
        params.put("param", "{\"jdOrderId\":" + jdOrderId + ",\"skuId\":" + skuId + "}");
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        return Integer.getInteger(result);
    }

    @Override
    public List<ComponentExport> getCustomerExpectComp(long jdOrderId, long skuId) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/getCustomerExpectComp";
        Map<String, Object> params = new HashMap<>();
        params.put("param", "{\"jdOrderId\":" + jdOrderId + ",\"skuId\":" + skuId + "}");
        return this.jdVopService.getResultArray(url,params,ComponentExport.class);
    }

    @Override
    public List<ComponentExport> getWareReturnJdComp(long jdOrderId, long skuId) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/getWareReturnJdComp";
        Map<String, Object> params = new HashMap<>();
        params.put("param", "{\"jdOrderId\":" + jdOrderId + ",\"skuId\":" + skuId + "}");
        return this.jdVopService.getResultArray(url,params,ComponentExport.class);
    }

    @Override
    public AfsServicebyCustomerPinPage getServiceListPage(AfsServiceByPhoneQuery afsServiceByPhoneQuery) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/getServiceListPage";
        Map<String, Object> params = new HashMap<>();
        params.put("param", JSON.toJSONString(afsServiceByPhoneQuery));
        return this.jdVopService.getResultObject(url,params,AfsServicebyCustomerPinPage.class);
    }

    @Override
    public CompatibleServiceDetailDTO getServiceDetailInfo(long afsServiceId, List<Integer> appendInfoSteps) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/getServiceDetailInfo";
        Map<String, Object> params = new HashMap<>();
        params.put("param", "{\"afsServiceId\":" + afsServiceId + ",\"appendInfoSteps\":" + JSON.toJSONString(appendInfoSteps) + "}");
        return this.jdVopService.getResultObject(url,params,CompatibleServiceDetailDTO.class);
    }

    @Override
    public boolean auditCancel(List<Integer> serviceIdList, String approveNotes) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/afterSale/auditCancel";
        Map<String, Object> params = new HashMap<>();
        params.put("param", "{\"approveNotes\":" + "\"" + approveNotes + "\",\"serviceIdList\":" + JSON.toJSONString(serviceIdList) + "}");
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        if ("true".equalsIgnoreCase(result)) {
            return true;
        }
        return false;
    }

}
