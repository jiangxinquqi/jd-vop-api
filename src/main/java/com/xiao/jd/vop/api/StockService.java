package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.order.JdOrderItem;
import com.xiao.jd.vop.bean.stock.StockNewResult;
import com.xiao.jd.vop.bean.stock.StockResult;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.List;

/**
 * 〈京东库存服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 18:57
 * @since 1.0.0
 */
public interface StockService {

    /**
     * 6.2 批量获取库存接口（建议订单详情页、下单使用）
     *
     * @param skuNums 商品和数量
     * @param jdArea  地址信息
     * @return: 库存信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 9:31
     */
    List<StockNewResult> getNewStockById(List<JdOrderItem> skuNums, JdArea jdArea) throws JdVopResultException;

    /**
     * 6.3 批量获取库存接口(建议商品列表页使用)
     *
     * @param sku    商品编号(最高支持 100 个商品)
     * @param jdArea 地址信息
     * @return: 库存信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 9:56
     */
    List<StockResult> getStockById(List<Long> sku, JdArea jdArea) throws JdVopResultException;
}