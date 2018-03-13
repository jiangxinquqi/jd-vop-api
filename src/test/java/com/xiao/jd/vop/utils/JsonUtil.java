package com.xiao.jd.vop.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @auther jianjun.xiao
 * @create 2018
 **/
public class JsonUtil {
    // JSON美化输出
    public static void jsonFomart(Object object) {
        String str = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            str = mapper.writeValueAsString(object);
        } catch (Exception e) {
            str = object.toString();
        }
        System.out.println(str);
    }
}
