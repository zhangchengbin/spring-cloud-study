# spring-cloud-study
spring-cloud-study

**[中文文档网站](https://springcloud.cc/spring-cloud-netflix-zhcn.html)**

## eureka
> Eureka属于客户端发现模式，客户端负责决定相应服务实例的网络位置，并且对请求实现负载均衡。

```java
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main( String[] args ) {
    	SpringApplication.run( EurekaApplication.class, args );
    }
}
```

## Rebion
> Ribbon，简单说，主要提供客户侧的软件负载均衡算法。

## feign
> Feign使得 Java HTTP 客户端编写更方便。



