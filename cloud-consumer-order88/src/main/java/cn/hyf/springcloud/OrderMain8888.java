package cn.hyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created By 黄一飞 On 2020 04 09 16:44
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain8888
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderMain8888.class,args);
    }
}
