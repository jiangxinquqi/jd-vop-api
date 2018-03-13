package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.area.CheckAreaResult;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

import java.util.Map;

/**
 * 〈京东地址服务测试〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 17:35
 * @since 1.0.0
 */
public class AreaServiceTest extends JdVopServiceTest{

    // 4.1 获取一级地址
    @Test
    public void getProvinceTest() throws JdVopResultException {
        Map<String, Integer> province = this.jdVopService.getAreaService().getProvince();
        JsonUtil.jsonFomart(province);
    }

    // 4.2 获取二级地址
    @Test
    public void getCityTest() throws JdVopResultException {
        Map<String, Integer> city = this.jdVopService.getAreaService().getCity(22);
        JsonUtil.jsonFomart(city);
    }

    // 4.3 获取三级地址
    @Test
    public void getCountyTest() throws JdVopResultException {
        Map<String, Integer> city = this.jdVopService.getAreaService().getCounty(1962);
        JsonUtil.jsonFomart(city);
    }

    // 4.4 获取四级地址
    @Test
    public void getTownTest() throws JdVopResultException {
        Map<String, Integer> town = this.jdVopService.getAreaService().getTown(39012);
        JsonUtil.jsonFomart(town);
    }

    // 4.5 验证四级地址是否正确
    @Test
    public void checkArea() throws JdVopResultException {
        JdArea jdArea = new JdArea(22,1962,39012,39066);
        CheckAreaResult checkAreaResult = this.jdVopService.getAreaService().checkArea(jdArea);
        JsonUtil.jsonFomart(checkAreaResult);
    }

}
