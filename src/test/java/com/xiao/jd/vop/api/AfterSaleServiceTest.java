package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.aftersale.*;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈京东售后服务测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 14:58
 * @since 1.0.0
 */
public class AfterSaleServiceTest extends JdVopServiceTest {

    // 10.1 服务单保存申请
    @Test
    public void createAfsApplyTest() throws JdVopResultException {
        AfterSaleDto AfterSaleDto = new AfterSaleDto();
        boolean isSuccess = this.jdVopService.getAfterSaleService().createAfsApply(AfterSaleDto);
        System.out.println(isSuccess);
    }

    // 10.2 填写客户发运信息
    @Test
    public void updateSendSkuTest() throws JdVopResultException {
        AfsCustomerDeliverDetailDto afsCustomerDeliverDetailDto = new AfsCustomerDeliverDetailDto();
        boolean isSuccess = this.jdVopService.getAfterSaleService().updateSendSku(afsCustomerDeliverDetailDto);
        System.out.println(isSuccess);
    }

    // 10.3 校验某订单中某商品是否可以提交售后服务
    @Test
    public void getAvailableNumberCompTest() throws JdVopResultException {
        long jdOrderId = 8595143958L;
        long skuId = 209951L;
        int afsNum = this.jdVopService.getAfterSaleService().getAvailableNumberComp(jdOrderId, skuId);
        System.out.println(afsNum);
    }

    // 10.4 根据订单号、商品编号查询支持的服务类型
    @Test
    public void getCustomerExpectCompTest() throws JdVopResultException {
        long jdOrderId = 8595143958L;
        long skuId = 209951L;
        List<ComponentExport> customerExpectComp = this.jdVopService.getAfterSaleService().getCustomerExpectComp(jdOrderId, skuId);
        JsonUtil.jsonFomart(customerExpectComp);
    }

    // 10.5 根据订单号、商品编号查询支持的商品返回京东方式
    public void getWareReturnJdCompTest() throws JdVopResultException {
        long jdOrderId = 8595143958L;
        long skuId = 209951L;
        List<ComponentExport> componentExports = this.jdVopService.getAfterSaleService().getWareReturnJdComp(jdOrderId, skuId);
        JsonUtil.jsonFomart(componentExports);
    }

    // 10.6 根据客户账号和订单号分页查询服务单概要信息
    @Test
    public void getServiceListPageTest() throws JdVopResultException {
        AfsServiceByPhoneQuery AfsServiceByPhoneQuery = new AfsServiceByPhoneQuery(12772904102L, 10, 1);
        AfsServicebyCustomerPinPage afsServicebyCustomerPinPage = this.jdVopService.getAfterSaleService().getServiceListPage(AfsServiceByPhoneQuery);
        JsonUtil.jsonFomart(afsServicebyCustomerPinPage);
    }

    // 10.7 根据服务单号查询服务单明细信息
    @Test
    public void getServiceDetailInfoTest() throws JdVopResultException {
        long afsServiceId = 12312L;
        List<Integer> appendInfoSteps = new ArrayList<>();
        appendInfoSteps.add(1);
        CompatibleServiceDetailDTO compatibleServiceDetailDTO = this.jdVopService.getAfterSaleService().getServiceDetailInfo(afsServiceId, appendInfoSteps);
        JsonUtil.jsonFomart(compatibleServiceDetailDTO);
    }

    // 10.8 取消服务单/客户放弃
    @Test
    public void auditCancelTest() throws JdVopResultException {
        ArrayList<Integer> serviceIdList = new ArrayList<>();
        serviceIdList.add(371780816);
        String approveNotes = "哈哈哈哈哈哈";
        try {
            boolean isSuccess = this.jdVopService.getAfterSaleService().auditCancel(serviceIdList, approveNotes);
            System.out.println(isSuccess);
        } catch (JdVopResultException e) {
            System.out.println(e.getResultCode());
            System.out.println(e.getResultMessage());
            e.printStackTrace();
        }
    }

}
