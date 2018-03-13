package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.check.CheckOrderPage;
import com.xiao.jd.vop.exception.JdVopResultException;

/**
 * 〈企销对账服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 13:45
 * @since 1.0.0
 */
public interface CheckOrderService {

    /**
     * 8.1 新建订单查询接口
     *
     * @param date 时间，格式：2013-11-7
     * @param page 当前页码
     * @return: 新建订单分页信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 14:03
     */
    CheckOrderPage checkNewOrder(String date, int page) throws JdVopResultException;

    /**
     * 8.2 获取妥投订单接口
     *
     * @param date 时间，格式：2013-11-7
     * @param page 当前页码
     * @return: 妥投订单分页信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 14:11
     */
    CheckOrderPage checkDlokOrder(String date, int page) throws JdVopResultException;

    /**
     * 8.3 获取拒收消息接口
     *
     * @param date 时间，格式：2013-11-7
     * @param page 当前页码
     * @return: 拒收消息分页信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 14:18
     */
    CheckOrderPage checkRefuseOrder(String date, int page) throws JdVopResultException;
}
