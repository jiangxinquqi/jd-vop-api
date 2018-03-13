package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.aftersale.*;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈京东售后服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 14:57
 * @since 1.0.0
 */
public interface AfterSaleService {

    /**
     * 10.1 服务单保存申请
     * 需要该配送单已经妥投。
     * 需要先调用 10.3 接口校验订单中某商品是否可以提交售后服务
     * 需要先调用 10.4 接口查询支持的服务类型
     * 需要先调用 10.5 接口查询支持的商品返回京东方式
     *
     * @param afterSaleDto 服务单
     * @return: true-成功 ，false-失败
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 15:14
     */
    boolean createAfsApply(AfterSaleDto afterSaleDto) throws JdVopResultException;

    /**
     * 10.2 填写客户发运信息
     * 需要调用 10.6 查询得到服务单号
     * 并且有需要补充客户发运信息时调用这个接口
     *
     * @param afsCustomerDeliverDetailDto 客户发运信息
     * @return: 是否成功
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 16:24
     */
    boolean updateSendSku(AfsCustomerDeliverDetailDto afsCustomerDeliverDetailDto) throws JdVopResultException;

    /**
     * 10.3 校验某订单中某商品是否可以提交售后服务
     *
     * @param jdOrderId 京东订单号
     * @param skuId     京东商品编号
     * @return: 可提交售后数量
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 16:31
     */
    int getAvailableNumberComp(long jdOrderId, long skuId) throws JdVopResultException;

    /**
     * 10.4 根据订单号、商品编号查询支持的服务类型
     *
     * @param jdOrderId 京东订单号
     * @param skuId     京东商品编号
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 16:43
     */
    List<ComponentExport> getCustomerExpectComp(long jdOrderId, long skuId) throws JdVopResultException;

    /**
     * 10.5 根据订单号、商品编号查询支持的商品返回京东方式
     *
     * @param jdOrderId 京东订单号
     * @param skuId     京东商品编号
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 16:48
     */
    List<ComponentExport> getWareReturnJdComp(long jdOrderId, long skuId) throws JdVopResultException;

    /**
     * 10.6 根据客户账号和订单号分页查询服务单概要信息
     *
     * @param afsServiceByPhoneQuery
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 15:51
     */
    AfsServicebyCustomerPinPage getServiceListPage(AfsServiceByPhoneQuery afsServiceByPhoneQuery) throws JdVopResultException;

    /**
     * 10.7 根据服务单号查询服务单明细信息
     *
     * @param afsServiceId    服务单号
     * @param appendInfoSteps 获取信息模块
     *                        不设置数据表示只获取服务单主信息、商品明细以及客户信息；
     *                        1、代表增加获取售后地址信息
     *                        2、代表增加获取客户发货信息
     *                        3、代表增加获取退款明细
     *                        4、 增加获取跟踪信息
     *                        5.获取允许的操作信息
     * @return: CompatibleServiceDetailDTO 服务单明细信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 19:50
     */
    CompatibleServiceDetailDTO getServiceDetailInfo(long afsServiceId, List<Integer> appendInfoSteps) throws JdVopResultException;

    /**
     * 10.8 取消服务单/客户放弃
     * 需要调用 10.6 查询得到服务单号
     *
     * @param serviceIdList 服务单号集合
     * @param approveNotes  审核意见
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 19:56
     */
    boolean auditCancel(List<Integer> serviceIdList, String approveNotes) throws JdVopResultException;
}
