package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.JdVopResult;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.product.*;
import com.xiao.jd.vop.bean.JdVopResult;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 〈商品服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 15:32
 * @since 1.0.0
 */
public interface ProductService {

    /**
     * 3.1 获取商品池编号接口
     */
    List<PageNum> getPageNum() throws JdVopResultException;

    /**
     * 3.2 获取池内商品编号接口-品类商品池（兼容老接口）
     *
     * @param pageNum 商品池编号
     * @param pageNo  页码，默认取第一页；每页最多 10000 条数据
     * @return: com.xiao.jd.vop.bean.product.SkuPage
     * @Author: jianjun.xiao
     * @Date: 2018/2/7 16:37
     */
    SkuPage getSkuByPage(String pageNum, int pageNo) throws JdVopResultException;

    /**
     * 3.3 获取商品详细信息接口
     *
     * @param sku    商品编号，只支持单个查询
     * @param isShow 默认 false:查询商品基本信息；
     *               true:商品基本信息 + 商品售后信息 + 移动商品详情介绍信息
     * @return: com.xiao.jd.vop.bean.product.GeneralDetail
     * @Author: jianjun.xiao
     * @Date: 2018/2/7 17:32
     */
    GeneralDetail getDetail(long sku, boolean isShow) throws JdVopResultException;

    /**
     * 3.4 获取商品上下架状态接口
     *
     * @param skus 商品编号，支持批量(最高支持 100 个商品)
     * @return: 状态集
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 10:43
     */
    List<SkuState> skuState(List<Long> skus) throws JdVopResultException;

    /**
     * 3.5 获取所有图片信息
     *
     * @param skus 商品编号，支持批量(最高支持 100 个商品)
     * @return: Map<Long, List<SkuImage>>
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 11:16
     */
    Map<Long, List<SkuImage>> skuImage(List<Long> skus) throws JdVopResultException;

    /**
     * 3.6 商品好评度查询
     *
     * @param sku 商品编号，支持批量(最高支持 50 个商品)
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/9 20:10
     */
    List<CommentSummarys> getCommentSummarys(List<Long> sku) throws JdVopResultException;

    /**
     * 3.7 商品区域购买限制查询
     *
     * @param skuIds 商品编号，支持批量(最高支持 100 个商品)
     * @param jdArea 查询区域
     * @return: 区域限制信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 15:53
     */
    List<AreaLimit> checkAreaLimit(List<Long> skuIds, JdArea jdArea) throws JdVopResultException;

    /**
     * 3.8 商品区域是否支持货到付款
     *
     * @param skuIds 商品编号，支持批量(最高支持 100 个商品)
     * @param jdArea 查询区域
     * @return: 若验证所有商品都支持货到付款，则返回 true;除此之外返回 false
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 16:05
     */
    JdVopResult getIsCod(List<Long> skuIds, JdArea jdArea) throws JdVopResultException;

    /**
     * 3.9 查询赠品信息接口
     *
     * @param skuId  商品编号，只支持单个查询
     * @param jdArea 京东地区
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 16:39
     */
    SkuGift getSkuGift(long skuId, JdArea jdArea) throws JdVopResultException;

    /**
     * 3.12 商品可售验证接口
     *
     * @param skuIds 商品编号，支持批量(最高支持 100 个商品)
     * @return: 可售信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 15:37
     */
    List<SellState> check(List<Long> skuIds) throws JdVopResultException;

    /**
     * 3.14 查询分类信息接口
     *
     * @param cid 分类 id（可通过商品详情接口查询）
     * @return:
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 16:51
     */
    Category getCategory(long cid) throws JdVopResultException;

    /**
     * 3.15 查询分类列表信息接口
     *
     * @param categoryPageReqVo 商品分类信息分页请求对象
     * @return: CategoryPage 商品分页信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 17:15
     */
    CategoryPage getCategorys(CategoryPageReqVo categoryPageReqVo) throws JdVopResultException;

    /**
     * 3.16 同类商品查询
     *
     * @param skuId 商品编号
     * @return: 同类信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 17:27
     */
    List<SimilarProduct> getSimilarSku(long skuId) throws JdVopResultException;

}
