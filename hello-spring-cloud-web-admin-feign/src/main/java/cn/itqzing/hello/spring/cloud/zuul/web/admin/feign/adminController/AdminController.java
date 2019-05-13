package cn.itqzing.hello.spring.cloud.zuul.web.admin.feign.adminController;

import cn.itqzing.hello.spring.cloud.zuul.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return adminService.sayHello(message);
    }
}