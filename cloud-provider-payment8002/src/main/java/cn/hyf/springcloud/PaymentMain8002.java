package cn.hyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created By 黄一飞 On 2020 04 08 17:35
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
