package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.order.JdFreight;
import com.xiao.jd.vop.bean.order.JdOrder;
import com.xiao.jd.vop.bean.order.JdOrderDetail;
import com.xiao.jd.vop.bean.order.OrderTrackDetail;
import com.xiao.jd.vop.exception.JdVopResultException;

/**
 * 〈京东订单服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 11:36
 * @since 1.0.0
 */
public interface OrderService {

    /**
     * 3.10 运费查询接口
     *
     * @param jdOrder 京东订单
     * @return: com.xiao.jd.vop.bean.order.JdFreight
     * @Author:jianjun.xiao
     * @Date: 2018/2/8 14:11
     */
    JdFreight getFreight(JdOrder jdOrder) throws JdVopResultException;

    /**
     * 7.6 订单反查接口,通过客户订单号查询京东订单号
     *
     * @param thirdOrderId 客户系统订单号
     * @return: jdOrderId 京东订单号
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 10:10
     */
    String selectJdOrderIdByThirdOrder(String thirdOrderId) throws JdVopResultException;

    /**
     * 7.7 查询京东订单信息接口
     *
     * @param jdOrderId 京东订单号
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 10:24
     */
    JdOrderDetail selectJdOrder(long jdOrderId) throws JdVopResultException;

    OrderTrackDetail orderTrack(long jdOrderId) throws JdVopResultException;
}
