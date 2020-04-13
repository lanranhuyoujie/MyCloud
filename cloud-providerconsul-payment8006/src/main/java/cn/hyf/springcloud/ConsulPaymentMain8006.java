package cn.hyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created By 黄一飞 On 2020 04 10 16:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPaymentMain8006
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsulPaymentMain8006.class,args);
    }
}
