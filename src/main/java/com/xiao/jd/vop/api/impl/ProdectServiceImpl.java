package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.api.ProductService;
import com.xiao.jd.vop.bean.JdVopResult;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.bean.product.*;
import com.xiao.jd.vop.exception.JdVopResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈ProdectServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 15:33
 * @since 1.0.0
 */
public class ProdectServiceImpl implements ProductService {

    /**
     * logger
     */
    private static final Logger log = LoggerFactory.getLogger(ProdectServiceImpl.class);

    private JdVopService jdVopService;

    public ProdectServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public List<PageNum> getPageNum() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getPageNum";
        Map<String, Object> params = new HashMap<>();
        return this.jdVopService.getResultArray(url, params, PageNum.class);
    }

    @Override
    public SkuPage getSkuByPage(String pageNum, int pageNo) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getSkuByPage";
        Map<String, Object> params = new HashMap<>();
        params.put("pageNum", pageNum);
        params.put("pageNo", pageNo);
        return this.jdVopService.getResultObject(url, params, SkuPage.class);
    }

    @Override
    public GeneralDetail getDetail(long sku, boolean isShow) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getDetail";
        Map<String, Object> params = new HashMap<>();
        params.put("sku", sku);
        params.put("isShow", isShow);
        return this.jdVopService.getResultObject(url, params, GeneralDetail.class);
    }

    @Override
    public List<SkuState> skuState(List<Long> skus) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/skuState";
        Map<String, Object> params = new HashMap<>();
        params.put("sku", SkuPage.getSkuString(skus));
        return this.jdVopService.getResultArray(url, params, SkuState.class);
    }

    @Override
    public Map<Long, List<SkuImage>> skuImage(List<Long> skus) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/skuImage";
        Map<String, Object> params = new HashMap<>();
        params.put("sku", SkuPage.getSkuString(skus));
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        return JSON.parseObject(result, new TypeReference<HashMap<Long, List<SkuImage>>>() {
        });
    }

    @Override
    public List<CommentSummarys> getCommentSummarys(List<Long> sku) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getCommentSummarys";
        Map<String, Object> params = new HashMap<>();
        params.put("sku", SkuPage.getSkuString(sku));
        return this.jdVopService.getResultArray(url, params, CommentSummarys.class);
    }

    @Override
    public List<AreaLimit> checkAreaLimit(List<Long> skuIds, JdArea jdArea) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/checkAreaLimit";
        Map<String, Object> params = new HashMap<>();
        params.put("skuIds", SkuPage.getSkuString(skuIds));
        params.put("province", jdArea.getProvince());
        params.put("city", jdArea.getCity());
        params.put("county", jdArea.getCounty());
        params.put("town", jdArea.getTown());
        return this.jdVopService.getResultArray(url, params, AreaLimit.class);
    }

    @Override
    public JdVopResult getIsCod(List<Long> skuIds, JdArea jdArea) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getIsCod";
        Map<String, Object> params = new HashMap<>();
        params.put("skuIds", SkuPage.getSkuString(skuIds));
        params.put("province", jdArea.getProvince());
        params.put("city", jdArea.getCity());
        params.put("county", jdArea.getCounty());
        params.put("town", jdArea.getTown());
        JdVopResult jdVopResult = this.jdVopService.getJdVopResult(url, params);
        if (!jdVopResult.isSuccess()) {
            throw new JdVopResultException(jdVopResult);
        }
        return jdVopResult;
    }

    @Override
    public SkuGift getSkuGift(long skuId, JdArea jdArea) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getSkuGift";
        Map<String, Object> params = new HashMap<>();
        params.put("skuId", skuId);
        params.put("province", jdArea.getProvince());
        params.put("city", jdArea.getCity());
        params.put("county", jdArea.getCounty());
        params.put("town", jdArea.getTown());
        return this.jdVopService.getResultObject(url, params, SkuGift.class);
    }

    @Override
    public List<SellState> check(List<Long> skuIds) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/check";
        Map<String, Object> params = new HashMap<>();
        params.put("skuIds", SkuPage.getSkuString(skuIds));
        return this.jdVopService.getResultArray(url, params, SellState.class);
    }

    @Override
    public Category getCategory(long cid) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getCategory";
        Map<String, Object> params = new HashMap<>();
        params.put("cid", cid);
        return this.jdVopService.getResultObject(url, params, Category.class);
    }

    @Override
    public CategoryPage getCategorys(CategoryPageReqVo categoryPageReqVo) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getCategorys";
        Map<String, Object> params = new HashMap<>();
        params.put("pageNo", categoryPageReqVo.getPageNo());
        params.put("pageSize", categoryPageReqVo.getPageSize());
        params.put("parentId", categoryPageReqVo.getParentId());
        params.put("catClass", categoryPageReqVo.getCatClass());
        return this.jdVopService.getResultObject(url, params, CategoryPage.class);
    }

    @Override
    public List<SimilarProduct> getSimilarSku(long skuId) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/product/getSimilarSku";
        Map<String, Object> params = new HashMap<>();
        params.put("skuId", skuId);
        return this.jdVopService.getResultArray(url, params, SimilarProduct.class);
    }

}
