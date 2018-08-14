package com.springboot.whp.whpdemo.config.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author whp 18-8-14
 */
//读取配置文件前缀为hello.msg的配置
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    //默认配置hello.msg=wold
    public static final String MSG="wold";
    private String msg=MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
