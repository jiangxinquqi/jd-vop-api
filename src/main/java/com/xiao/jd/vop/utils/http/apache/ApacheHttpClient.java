package com.xiao.jd.vop.utils.http.apache;

import com.xiao.jd.vop.utils.http.HttpProxy;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 〈Apache实现的http请求客户端〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/7 11:29
 * @since 1.0.0
 */
public class ApacheHttpClient implements HttpProxy {

    @Override
    public String post(String url, Map<String, Object> params) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = "";

        try {
            HttpPost post = new HttpPost(url);
            // 创建参数列表
            if (params != null) {
                List<NameValuePair> paramList = new ArrayList<>();
                for (String key : params.keySet()) {
                    paramList.add(new BasicNameValuePair(key, String.valueOf(params.get(key))));
                }
                // 模拟表单
                post.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
            }
            response = httpClient.execute(post);
            result = new BasicResponseHandler().handleResponse(response);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;

    }

    @Override
    public String get(String url, Map<String, Object> params) {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = "";
        try {
            // 创建uri
            URIBuilder uriBuilder = new URIBuilder(url);
            if (params != null) {
                for (String key : params.keySet()) {
                    uriBuilder.addParameter(key, String.valueOf(params.get(key)));
                }
            }
            URI uri = uriBuilder.build();
            // 创建http GET请求
            HttpGet get = new HttpGet(uri);
            // 执行请求
            response = httpclient.execute(get);
            result = new BasicResponseHandler().handleResponse(response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
