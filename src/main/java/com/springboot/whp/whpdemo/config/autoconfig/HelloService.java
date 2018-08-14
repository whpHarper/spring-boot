package com.springboot.whp.whpdemo.config.autoconfig;

/**
 * @author whp 18-8-14
 */
public class HelloService {
    private String msg;

    public String sayHello(){
        return "hello "+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
