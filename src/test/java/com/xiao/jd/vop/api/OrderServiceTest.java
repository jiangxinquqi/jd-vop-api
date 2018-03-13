package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.JdVopResult;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.order.*;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

import java.util.*;

/**
 * 〈京东订单测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 14:13
 * @since 1.0.0
 */
public class OrderServiceTest extends JdVopServiceTest {

    private long jdParentOrderId = 63294221096L;
    private long jdChildOrderId = 71225456309L;

    // 3.10 运费查询接口
    @Test
    public void getFreightTest() throws JdVopResultException {
        // 创建订单项
        List<JdOrderItem> sku = new ArrayList<>();
        sku.add(new JdOrderItem(186289L, 2));
        sku.add(new JdOrderItem(186291L, 3));
        // 设置收货地址
        JdArea jdArea = new JdArea(1, 2, 3, 0);
        // 设置支付方式
        int paymentType = 4;
        // 构建订单
        JdOrder jdOrder = new JdOrder(sku, jdArea, paymentType);

        // 查询运费
        JdFreight freight = this.jdVopService.getOrderService().getFreight(jdOrder);
        JsonUtil.jsonFomart(freight);
    }

    // TODO 7.1 统一下单接口
    @Test
    public void submitOrderTest() throws JdVopResultException {
        String thirdOrder = "2018021101";
        String sku = "";
        String url = "https://bizapi.jd.com/api/order/submitOrder";
        Map<String, Object> map = new HashMap<>();
        map.put("thirdOrder", thirdOrder);
        map.put("sku",sku);
        JdVopResult jdVopResult = this.jdVopService.getJdVopResult(url, map);
        JsonUtil.jsonFomart(jdVopResult);
    }

    // TODO 7.2 确认预占库存订单接口
    @Test
    public void confirmOrderTest() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/confirmOrder";
        Map<String, Object> map = new HashMap<>();
        JdVopResult jdVopResult = this.jdVopService.getJdVopResult(url, map);
        JsonUtil.jsonFomart(jdVopResult);
    }

    // TODO 7.3 取消未确认订单接口
    @Test
    public void cancelTest() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/cancel";
        Map<String, Object> map = new HashMap<>();
        JdVopResult jdVopResult = this.jdVopService.getJdVopResult(url, map);
        JsonUtil.jsonFomart(jdVopResult);
    }

    // TODO 7.4 发起支付接口
    @Test
    public void doPayTest() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/doPay";
        Map<String, Object> map = new HashMap<>();
        JdVopResult jdVopResult = this.jdVopService.getJdVopResult(url, map);
        JsonUtil.jsonFomart(jdVopResult);
    }

    // TODO 7.5 获取京东预约日历
    @Test
    public void promiseCalendarTest() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/order/promiseCalendar";
        Map<String, Object> map = new HashMap<>();
        JdVopResult jdVopResult = this.jdVopService.getJdVopResult(url, map);
        JsonUtil.jsonFomart(jdVopResult);
    }

    // 7.6 订单反查接口
    @Test
    public void selectJdOrderIdByThirdOrderTest() throws JdVopResultException {
        // 子单
        // String thirdOrderId = "185006";
        // 71225456309

        // 父单
        String thirdOrderId = "151327";
        // 63294221096
        String jdOrderId = this.jdVopService.getOrderService().selectJdOrderIdByThirdOrder(thirdOrderId);
        System.out.println(jdOrderId);
    }

    // 7.7 查询京东订单信息接口
    @Test
    public void selectJdOrderTest() throws JdVopResultException {
        long jdOrderId = jdChildOrderId;
        JdOrderDetail jdOrderDetail = this.jdVopService.getOrderService().selectJdOrder(jdOrderId);
        if (jdOrderDetail.getType() == 1) {
            jdOrderDetail = (JdParentOrderDetail) jdOrderDetail;
        } else {
            jdOrderDetail = (JdChildrenOrderDetail) jdOrderDetail;
        }
        JsonUtil.jsonFomart(jdOrderDetail);
    }

    // 7.8 查询配送信息接口
    @Test
    public void orderTrackTest() throws JdVopResultException {
        // long jdOrderId = jdChildOrderId;
        long jdOrderId = 8781855780L;
        OrderTrackDetail orderTrackDetail = this.jdVopService.getOrderService().orderTrack(jdOrderId);
        JsonUtil.jsonFomart(orderTrackDetail);
    }

    // 7.9 请在PriceService中查找

    // 7.10 请在PriceService中查找

    // 7.11 余额明细查询接口

}
