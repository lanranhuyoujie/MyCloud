package cn.hyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created By 黄一飞 On 2020 04 10 15:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8003
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8003.class,args);
    }
}
