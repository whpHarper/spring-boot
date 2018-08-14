package com.springboot.whp.whpdemo.config.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author whp 18-8-14
 */
@Configuration
//允许属性配置类
@EnableConfigurationProperties(HelloServiceProperties.class)
//属性类作用的服务类
@ConditionalOnClass(HelloService.class)
//value--数组，获取对应property名称的值，与name不可同时使用。
// 作用：value单独使用时：当对应property名称的值为false时，该configuration不生效；
// 当对应property名称的值为除false之外的值时，该configuration生效
//缺少该property时是否可以加载。如果为true，没有该property也会正常加载；反之报错
@ConditionalOnProperty(prefix = "hello",value="enable",matchIfMissing = true)
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService=new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
