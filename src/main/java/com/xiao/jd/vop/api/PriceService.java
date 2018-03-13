package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.price.BalanceDetailPage;
import com.xiao.jd.vop.bean.price.BalanceDetailPageReqVo;
import com.xiao.jd.vop.bean.price.JincaiCredit;
import com.xiao.jd.vop.bean.price.SellPrice;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.List;

/**
 * 〈京东价格服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 18:38
 * @since 1.0.0
 */
public interface PriceService {
    /**
     * 5.1 批量查询商品售卖价
     *
     * @param sku 商品编号(最高支持 100 个商品)
     * @return: 价格信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 18:39
     */
    List<SellPrice> getSellPrice(List<Long> sku) throws JdVopResultException;

    /**
     * 7.9 统一余额查询接口
     *
     * @param payType 支付类型
     *                4：余额
     *                7：网银钱包
     *                101：金采支付
     * @return: 账户余额
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 12:36
     */
    String getBalance(int payType) throws JdVopResultException;

    /**
     * 7.10 查询用户金彩余额接口（仅供金彩支付客户使用）
     * 
     * @return: JincaiCredit 用户金彩账户信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 12:48
     */
    JincaiCredit selectJincaiCredit() throws JdVopResultException;

    /**
     * 7.11 余额明细查询接口
     *
     * @param balanceDetailPageReqVo 余额明细查询分页对象
     * @return: BalanceDetailPage 余额明细分页结果对象
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 13:09
     */
    BalanceDetailPage getBalanceDetail(BalanceDetailPageReqVo balanceDetailPageReqVo) throws JdVopResultException, NoSuchFieldException;
}
