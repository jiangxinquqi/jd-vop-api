package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.area.CheckAreaResult;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.Map;

/**
 * 〈京东地址服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 17:38
 * @since 1.0.0
 */
public interface AreaService {

    /**
     * 4.1 获取一级地址
     *
     * @return: 一级地址信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 17:40
     */
    Map<String, Integer> getProvince() throws JdVopResultException;

    /**
     * 4.2 获取二级地址
     *
     * @param id 一级地址
     * @return: 二级地址信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 17:51
     */
    Map<String, Integer> getCity(int id) throws JdVopResultException;

    /**
     * 4.3 获取三级地址
     *
     * @param id 二级地址
     * @return: 三级地址信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 17:55
     */
    Map<String, Integer> getCounty(int id) throws JdVopResultException;

    /**
     * 4.4 获取四级地址
     *
     * @param id 三级地址
     * @return: 四级地址信息
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 18:03
     */
    Map<String, Integer> getTown(int id) throws JdVopResultException;

    /**
     * 4.5 验证四级地址是否正确
     *
     * @param jdArea 京东地址信息
     * @return: com.xiao.jd.vop.bean.area.CheckAreaResult
     * @Author: jianjun.xiao
     * @Date: 2018/2/8 18:16
     */
    CheckAreaResult checkArea(JdArea jdArea) throws JdVopResultException;
}
