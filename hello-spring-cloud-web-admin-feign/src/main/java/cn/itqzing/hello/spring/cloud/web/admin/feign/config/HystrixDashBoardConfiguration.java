package cn.itqzing.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixDashBoardConfiguration {
    @Bean
    public ServletRegistrationBean getHystrixDashBoardServlet(){
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(hystrixMetricsStreamServlet, "/hystrix.stream");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setName("HystrixStreamServlet");
        return servletRegistrationBean;
    }
}
