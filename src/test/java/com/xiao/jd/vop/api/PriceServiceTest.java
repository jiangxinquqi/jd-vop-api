package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.price.BalanceDetailPage;
import com.xiao.jd.vop.bean.price.BalanceDetailPageReqVo;
import com.xiao.jd.vop.bean.price.JincaiCredit;
import com.xiao.jd.vop.bean.price.SellPrice;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈京东价格服务测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 18:34
 * @since 1.0.0
 */
public class PriceServiceTest extends JdVopServiceTest{

    // 5.1 批量查询商品售卖价
    @Test
    public void getSellPrice() throws JdVopResultException {
        List<Long> sku = new ArrayList<>();
        sku.add(186289L);
        sku.add(186291L);
        sku.add(4530023L);
        List<SellPrice> sellPrices = this.jdVopService.getPriceService().getSellPrice(sku);
        JsonUtil.jsonFomart(sellPrices);
    }

    // 7.9 统一余额查询接口
    @Test
    public void getBalanceTest() throws JdVopResultException {
        int payType = 4;
        String balance = this.jdVopService.getPriceService().getBalance(payType);
        System.out.println(balance);
    }

    // 7.10 查询用户金彩余额接口（仅供金彩支付客户使用）
    @Test
    public void selectJincaiCreditTest() throws JdVopResultException {
        JincaiCredit jincaiCredit = this.jdVopService.getPriceService().selectJincaiCredit();
        JsonUtil.jsonFomart(jincaiCredit);
    }

    // 7.11 余额明细查询接口
    @Test
    public void getBalanceDetailTest() throws JdVopResultException, NoSuchFieldException {
        BalanceDetailPageReqVo balanceDetailPageReqVo = new BalanceDetailPageReqVo();

        balanceDetailPageReqVo.setStartDate(new Date(1418154660882L));
        balanceDetailPageReqVo.setEndDate(new Date(1518154760882L));
        BalanceDetailPage balanceDetailPage = this.jdVopService.getPriceService().getBalanceDetail(balanceDetailPageReqVo);
        JsonUtil.jsonFomart(balanceDetailPage);
    }

}
