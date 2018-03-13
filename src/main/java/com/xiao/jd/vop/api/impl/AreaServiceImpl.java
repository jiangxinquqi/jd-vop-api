package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xiao.jd.vop.api.AreaService;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.bean.area.CheckAreaResult;
import com.xiao.jd.vop.bean.area.JdArea;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈AreaServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 17:42
 * @since 1.0.0
 */
public class AreaServiceImpl implements AreaService {

    private JdVopService jdVopService;

    public AreaServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public Map<String, Integer> getProvince() throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/area/getProvince";
        return this.getAreaMap(url, -1);
    }

    @Override
    public Map<String, Integer> getCity(int id) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/area/getCity";
        return this.getAreaMap(url, id);
    }

    @Override
    public Map<String, Integer> getCounty(int id) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/area/getCounty";
        return this.getAreaMap(url, id);
    }

    @Override
    public Map<String, Integer> getTown(int id) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/area/getTown";
        return this.getAreaMap(url, id);
    }

    @Override
    public CheckAreaResult checkArea(JdArea jdArea) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/area/checkArea";
        Map<String, Object> params = new HashMap<>();
        params.put("token", this.jdVopService.getAccessToken());
        params.put("provinceId",jdArea.getProvince());
        params.put("cityId",jdArea.getCity());
        params.put("countyId",jdArea.getCounty());
        params.put("townId",jdArea.getTown());
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        return JSON.parseObject(result,CheckAreaResult.class);
    }

    public Map<String, Integer> getAreaMap(String url, int id) throws JdVopResultException {
        Map<String, Object> params = new HashMap<>();
        if (id != -1) {
            params.put("id", id);
        }
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        return JSON.parseObject(result, new TypeReference<Map<String, Integer>>() {
        });
    }
}
