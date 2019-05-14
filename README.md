
##springcloud基础框架搭建
###各个服务的功能说明
####hello-spring-cloud-dependcies 为其它服务提供基础依赖
####hello-spring-cloud-eureka 注册中心
#####测试地址：http://localhost:8761
####hello-spring-cloud-config 分布式配置中心
#####测试地址：http://localhost:8888/hello-web-admin-ribbon/dev/master 
####hello-spring-cloud-zipkin 链路追踪
#####测试地址：http://localhost:9411/ 
####hello-spring-cloud-admin 健康服务监控
#####测试地址：http://localhost:8084
####hello-spring-cloud-service-admin 服务提供者
#####测试地址：http://localhost:8762/hello?message=HelloSpring 
####hello-spring-cloud-ribbon 服务消费
#####测试地址：http://localhost:8764/hello?message=HelloRibbon 
#####hystrix Dashboard：http://localhost:8764/hystrix 输入http://localhost:8764/hystrix.stream访问
####hello-spring-cloud-feign 服务消费
#####测试地址：http://localhost:8765/hello?message=HelloFeign
#####hystrix Dashboard：http://localhost:8765/hystrix 输入http://localhost:8765/hystrix.stream访问
####hello-spring-cloud-zuul 网关服务
#####测试地址1：http://localhost:8769/api/ribbon/hello?message=HelloZuul
#####测试地址2：http://localhost:8769/api/feign/heelo?message=HelloZuul
#####网关拦截测试：http://localhost:8769/api/api/feign/hi?message=HelloZuul&token=12
###各个服务启动的顺序（可按照以上服务顺序启动）
#####1、注册与发现
#####2、分布式配置中心
#####3、服务提供者
#####4、服务消费者
#####5、API网关



