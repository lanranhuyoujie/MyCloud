package cn.hyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created By 黄一飞 On 2020 04 12 13:50
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527
{
    public static void main(String[] args)
    {
        SpringApplication.run(GatewayMain9527.class,args);
    }
}
