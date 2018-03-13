package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.order.JdOrderItem;
import com.xiao.jd.vop.bean.stock.StockNewResult;
import com.xiao.jd.vop.bean.stock.StockResult;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈京东库存服务测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 9:23
 * @since 1.0.0
 */
public class StockServiceTest extends JdVopServiceTest {

    // 6.2 批量获取库存接口（建议订单详情页、下单使用）
    @Test
    public void getNewStockByIdTest() throws JdVopResultException {
        List<JdOrderItem> skuNums = new ArrayList<>();
        skuNums.add(new JdOrderItem(186289L, 2));
        skuNums.add(new JdOrderItem(186291L, 2));
        JdArea jdArea = new JdArea(22, 1962, 39012, 39066);
        List<StockNewResult> stockNewResults = this.jdVopService.getStockService().getNewStockById(skuNums, jdArea);
        JsonUtil.jsonFomart(stockNewResults);
    }

    // 6.3 批量获取库存接口(建议商品列表页使用)
    @Test
    public void getStockByIdTest() throws JdVopResultException {
        List<Long> sku = new ArrayList<>();
        sku.add(186289L);
        sku.add(186291L);
        JdArea jdArea = new JdArea(22, 1962, 39012, 39066);
        List<StockResult> stockResults = this.jdVopService.getStockService().getStockById(sku, jdArea);
        JsonUtil.jsonFomart(stockResults);
    }

}
