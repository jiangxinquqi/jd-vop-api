package com.xiao.jd.vop.api;

import com.xiao.jd.vop.bean.message.MessageResult;
import com.xiao.jd.vop.exception.JdVopResultException;
import com.xiao.jd.vop.utils.JsonUtil;
import org.junit.Test;

import java.util.List;

/**
 * 〈京东信息推送服务〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 14:22
 * @since 1.0.0
 */
public class MessageServiceTest extends JdVopServiceTest{

    // 9.1 信息推送接口
    @Test
    public void getTest() throws JdVopResultException {
        String type = "1";
        List<MessageResult> messageResults = this.jdVopService.getMessageService().get(type);
        JsonUtil.jsonFomart(messageResults);
    }

    // 9.2 根据推送 id，删除推送信息接口
    @Test
    public void delTest() throws JdVopResultException {
        long id = 4116503848L;
        boolean isSuccess = this.jdVopService.getMessageService().del(id);
        System.out.println(isSuccess);
    }

}
