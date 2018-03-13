package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.message.MessageResult;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.List;

/**
 * 〈京东信息推送服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 14:21
 * @since 1.0.0
 */
public interface MessageService {

    /**
     * 9.1 信息推送接口
     *
     * @param type 推送类型，支持多个组合，例如 1,2,3
     *             1 代表订单拆分变更
     *             2 代表商品价格变更
     *             4 商品上下架变更消息
     *             5 代表该订单已妥投（买断模式代表外单已妥投或外单已拒收）
     *             6 代表添加、删除商品池内商品
     *             10 代表订单取消（不区分取消原因）
     *             12 代表配送单生成
     *             13 换新订单生成（换新单下单后推送，仅提供给买卖宝类型客户）
     *             14 支付失败消息
     *             15 7 天未支付取消消息/未确认取消（cancelType, 1: 7 天未支付取消消息; 2: 未确认取消）
     *             16 商品介绍及规格参数变更消息
     *             17 赠品促销变更消息
     *             25 新订单消息
     *             50 京东地址变更消息推送
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 14:34
     */
    List<MessageResult> get(String type) throws JdVopResultException;

    /**
     * 9.2 根据推送 id，删除推送信息接口
     *
     * @param id 9.1 获取到的消息id
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 14:47
     */
    boolean del(long id) throws JdVopResultException;
}
