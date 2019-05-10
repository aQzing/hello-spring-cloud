package cn.itqzing.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Value("${server.port}")
    private  String port;
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam("message")String message){
        return  String.format("hello,the message is %s,the port is %s",message,port);
    }
}
