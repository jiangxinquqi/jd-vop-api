package com.xiao.jd.vop.api;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.product.*;
import com.xiao.jd.vop.bean.JdVopResult;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈商品服务测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 15:34
 * @since 1.0.0
 */
public class ProductServiceTest extends JdVopServiceTest {

    // 3.1 获取商品池编号接口
    @Test
    public void getPageNumTest() throws JdVopResultException {
        List<PageNum> pageNum = this.jdVopService.getProductService().getPageNum();
        JsonUtil.jsonFomart(pageNum);
    }

    // 3.2 获取池内商品编号接口-品类商品池（兼容老接口）
    @Test
    public void getSkuByPageTest() throws JdVopResultException {
        // 获取商品池编号
        List<PageNum> pageNums = this.jdVopService.getProductService().getPageNum();

        // 获取每个商品池中的商品
        for (PageNum pageNum : pageNums) {
            logger.error("商品池编号：{}，商品池名称：{}", pageNum.getPage_num(), pageNum.getName());
            SkuPage skuPage = this.jdVopService.getProductService().getSkuByPage(pageNum.getPage_num(), 1);
            JsonUtil.jsonFomart(skuPage);
        }

    }

    // 3.3 获取商品详细信息接口
    @Test
    public void getDetailTest() throws JdVopResultException {
        long sku = 186289L;
        GeneralDetail detail = this.jdVopService.getProductService().getDetail(sku, false);
        JsonUtil.jsonFomart(detail);
    }

    // 3.4 获取商品上下架状态接口
    @Test
    public void skuStateTest() throws JdVopResultException {
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(186289L);
        arrayList.add(186291L);
        arrayList.add(186296L);
        arrayList.add(186300L);
        arrayList.add(186303L);
        arrayList.add(189655L);
        arrayList.add(200116L);
        List<SkuState> skuStates = this.jdVopService.getProductService().skuState(arrayList);
        JsonUtil.jsonFomart(skuStates);
    }

    // 3.5 获取所有图片信息
    @Test
    public void skuImageTest() throws JdVopResultException {
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(186289L);
        arrayList.add(186291L);
        Map<Long, List<SkuImage>> longListMap = this.jdVopService.getProductService().skuImage(arrayList);
        JsonUtil.jsonFomart(longListMap);
    }

    // 3.6 商品好评度查询
    @Test
    public void getCommentSummarysTest() throws JdVopResultException {
        ArrayList<Long> sku = new ArrayList<>();
        sku.add(186289L);
        sku.add(186291L);
        List<CommentSummarys> commentSummarys = this.jdVopService.getProductService().getCommentSummarys(sku);
        JsonUtil.jsonFomart(commentSummarys);
    }

    // 3.7 商品区域购买限制查询
    @Test
    public void checkAreaLimitTest() throws JdVopResultException {
        ArrayList<Long> skuIds = new ArrayList<>();
        skuIds.add(186289L);
        skuIds.add(186291L);
        JdArea jdArea = new JdArea(1, 2, 3, 0);
        List<AreaLimit> areaLimits = this.jdVopService.getProductService().checkAreaLimit(skuIds, jdArea);
        JsonUtil.jsonFomart(areaLimits);
    }

    // 3.8 商品区域是否支持货到付款
    @Test
    public void getIsCodTest() throws JdVopResultException {
        ArrayList<Long> skuIds = new ArrayList<>();
        skuIds.add(186289L);
        skuIds.add(186291L);
        JdArea jdArea = new JdArea(1, 2, 3, 0);
        JdVopResult isCod = this.jdVopService.getProductService().getIsCod(skuIds, jdArea);
        JsonUtil.jsonFomart(isCod);
    }

    // 3.9 查询赠品信息接口
    @Test
    public void getSkuGiftTest() throws JdVopResultException {
        long skuId = 186289L;
        JdArea jdArea = new JdArea(1, 2, 3, 0);
        SkuGift skuGift = this.jdVopService.getProductService().getSkuGift(skuId, jdArea);
        JsonUtil.jsonFomart(skuGift);
    }

    // 3.10 为订单服务，请在OrderService中查找

    // TODO 3.11 商品搜索接口
    @Test
    public void searchTest() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/search/search";
        Map<String,Object> map = new HashMap<>();
        JdVopResult jdVopResult = this.jdVopService.getJdVopResult(url, map);
        JsonUtil.jsonFomart(jdVopResult);
    }

    // 3.12 商品可售验证接口
    @Test
    public void check() throws JdVopResultException {
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(186289L);
        arrayList.add(186291L);
        List<SellState> check = this.jdVopService.getProductService().check(arrayList);
        JsonUtil.jsonFomart(check);
    }

    // TODO 3.13 查询商品延保接口

    // 3.14 查询分类信息接口
    @Test
    public void getCategoryTest() throws JdVopResultException {
        long cid = 670L;
        Category category = this.jdVopService.getProductService().getCategory(cid);
        JsonUtil.jsonFomart(category);
    }

    // 3.15 查询分类列表信息接口
    @Test
    public void getCategorysTest() throws JdVopResultException {
        CategoryPageReqVo categoryPageReqVo = new CategoryPageReqVo();
        categoryPageReqVo.setPageNo(1);
        categoryPageReqVo.setPageSize(5000);
        CategoryPage categorys = this.jdVopService.getProductService().getCategorys(categoryPageReqVo);
        JsonUtil.jsonFomart(categorys);
    }

    // 3.16 同类商品查询
    @Test
    public void getSimilarSku() throws JdVopResultException {
        long skuId = 941628L;
        List<SimilarProduct> similarSku = this.jdVopService.getProductService().getSimilarSku(skuId);
        JsonUtil.jsonFomart(similarSku);
    }

}
