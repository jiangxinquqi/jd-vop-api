package com.xiao.jd.vop.api.impl;

import com.alibaba.fastjson.JSON;
import com.xiao.jd.vop.api.JdVopService;
import com.xiao.jd.vop.api.MessageService;
import com.xiao.jd.vop.bean.message.MessageResult;
import com.xiao.jd.vop.exception.JdVopResultException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈MessageServiceImpl〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 14:22
 * @since 1.0.0
 */
public class MessageServiceImpl implements MessageService {
    private JdVopService jdVopService;

    public MessageServiceImpl(JdVopService jdVopService) {
        this.jdVopService = jdVopService;
    }

    @Override
    public List<MessageResult> get(String type) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/message/get";
        Map<String, Object> params = new HashMap<>();
        params.put("type", type);
        return this.jdVopService.getResultArray(url,params,MessageResult.class);
    }

    @Override
    public boolean del(long id) throws JdVopResultException {
        String url = "https://bizapi.jd.com/api/message/del";
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        String result = this.jdVopService.getResultString(this.jdVopService.post(url, params));
        if ("true".equalsIgnoreCase(result)) {
            return true;
        }
        return false;
    }
}
