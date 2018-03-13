package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.check.CheckOrderPage;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

/**
 * 〈企业对账服务测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 13:46
 * @since 1.0.0
 */
public class CheckOrderServiceTest extends JdVopServiceTest{

    // 8.1 新建订单查询接口
    @Test
    public void checkNewOrderTest() throws JdVopResultException {
        String date = "2017-11-7";
        int page = 1;
        CheckOrderPage checkOrderPage = this.jdVopService.getCheckOrderService().checkNewOrder(date,page);
        JsonUtil.jsonFomart(checkOrderPage);
    }

    // 8.2 获取妥投订单接口
    @Test
    public void checkDlokOrderTest() throws JdVopResultException {
        String date = "2017-11-7";
        int page = 1;
        CheckOrderPage checkOrderPage = this.jdVopService.getCheckOrderService().checkDlokOrder(date,page);
        JsonUtil.jsonFomart(checkOrderPage);
    }

    // 8.3 获取拒收消息接口
    @Test
    public void checkRefuseOrderTest() throws JdVopResultException {
        String date = "2017-12-7";
        int page = 1;
        CheckOrderPage checkOrderPage = this.jdVopService.getCheckOrderService().checkRefuseOrder(date,page);
        JsonUtil.jsonFomart(checkOrderPage);
    }

}
