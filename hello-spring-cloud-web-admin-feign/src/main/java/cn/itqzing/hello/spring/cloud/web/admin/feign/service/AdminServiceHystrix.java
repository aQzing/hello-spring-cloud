package cn.itqzing.hello.spring.cloud.web.admin.feign.service;

import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements  AdminService{
    @Override
    public String sayHello(String message) {
        return "Hello，your message is :\"" + message + "\" but request error.";
    }
}
